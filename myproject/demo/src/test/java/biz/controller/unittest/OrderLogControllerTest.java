package biz.controller.unittest;

import biz.config.AuthStatefulSecurityConfig;
import biz.controller.method.OrderLogControllerMethod;
import biz.controller.utils.OrderUtil;
import biz.controller.utils.TestUtil;
import com.alibaba.fastjson.TypeReference;
import com.jinjue.demo.DemoApplication;
import com.jinjue.demo.entity.OrderLogQueryVo;
import com.jinjue.demo.entity.OrderLogVo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.http.HttpStatus;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.MOCK
//        properties = {
//        "spring.cloud.zookeeper.enabled=false", "spring.cloud.config.enabled=false",
//        "spring.profiles.active=test" }
        )
@Transactional
@Rollback
@AutoConfigureMockMvc
@Import(AuthStatefulSecurityConfig.class)
public class OrderLogControllerTest {
    private OrderLogControllerMethod orderLogControllerMethod;
    @Autowired
    private MockMvc mockMvc;
    @Before
    public void setUp() {

        prepareParams(mockMvc);
    }

    public void prepareParams(MockMvc mockMvc) {

        this.mockMvc = mockMvc;
        orderLogControllerMethod = new OrderLogControllerMethod(mockMvc);
    }

    @Test
    @WithMockUser(username = TestUtil.USER_NAME, password = TestUtil.PASSWORD)
    public void testQuery() throws Exception {
        OrderLogQueryVo orderLogQueryVo=new OrderLogQueryVo();
        orderLogQueryVo.setOrderId(TestUtil.ORDER_ID);
        MockHttpServletResponse response=orderLogControllerMethod.query(orderLogQueryVo);
        Assert.assertEquals(HttpStatus.OK.value(),response.getStatus());
        List<OrderLogVo> orderLogVos = TestUtil.checkAndGet(response,new TypeReference<List<OrderLogVo>>(){});
        Assert.assertEquals(orderLogVos.size(),1);
        OrderLogVo orderLogVo=orderLogVos.get(0);
        OrderUtil.assertOrderLogVo(orderLogVo);
    }
    @Test
    @WithMockUser(username = TestUtil.USER_NAME, password = TestUtil.PASSWORD)
    public void testQueryEmpty() throws Exception {
        OrderLogQueryVo orderLogQueryVo=new OrderLogQueryVo();
        orderLogQueryVo.setOrderId(null);
        MockHttpServletResponse response=orderLogControllerMethod.query(orderLogQueryVo);
        Assert.assertEquals(HttpStatus.BAD_REQUEST.value(),response.getStatus());
        Assert.assertTrue(response.getContentAsString().contains("订单ID不能为空"));
    }
}
