package biz.controller.utils;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.springframework.mock.web.MockHttpServletResponse;

import java.io.UnsupportedEncodingException;

public class TestUtil {

	public static final String USER_NAME = "user";
	public static final String PASSWORD = "123456";

	public static final String ORDER_ID = "313889399677095936";

	public static <T> T checkAndGet(MockHttpServletResponse response, TypeReference<T> type)
			throws UnsupportedEncodingException {

		String retStr = response.getContentAsString();
		Assert.assertFalse(StringUtils.isEmpty(retStr));
		T t = JSONObject.parseObject(retStr, type);
		Assert.assertNotNull(t);
		return t;
	}
}
