package biz.controller.method;

import biz.controller.utils.HttpHelper;
import com.jinjue.demo.entity.OrderLogQueryVo;
import org.springframework.http.HttpMethod;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;

public class OrderLogControllerMethod {
    private static final String PRE_URL = "/orderLog";

    private MockMvc mockMvc;

    public OrderLogControllerMethod(MockMvc mockMvc) {

        this.mockMvc = mockMvc;
    }

    /**
     * 查询订单操作日志
     *
     * @param orderLogQueryVo
     * @return
     */
    public MockHttpServletResponse query(OrderLogQueryVo orderLogQueryVo) throws Exception {
        HttpHelper<OrderLogQueryVo> httpHelper = new HttpHelper<>(mockMvc);
        return httpHelper.request(HttpMethod.POST, PRE_URL + "/query", null, orderLogQueryVo, null);
    }
}
