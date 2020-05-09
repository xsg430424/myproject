package biz.controller.utils;

import com.jinjue.vo.response.OrderLogVo;
import org.junit.Assert;

public class OrderUtil {
    public static void assertOrderLogVo(OrderLogVo orderLogVo) {
        Assert.assertEquals(orderLogVo.getLogMsg(), "msg");
        Assert.assertEquals(orderLogVo.getLogState().intValue(), 1);
        Assert.assertEquals(orderLogVo.getLogUser(), "user");
        Assert.assertEquals(orderLogVo.getLogRole(), "admin");
    }
}
