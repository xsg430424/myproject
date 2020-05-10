package biz.controller.utils;

import com.alibaba.fastjson.JSON;
import lombok.Data;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.util.MultiValueMap;

@Data
public class HttpHelper<RequestBodyType> {

	private MockMvc mockMvc;

	public HttpHelper(MockMvc mockMvc) {

		this.mockMvc = mockMvc;
	}

	public MockHttpServletResponse request(HttpMethod method, String url,
                                           MultiValueMap<String, String> query, RequestBodyType body, String token)
			throws Exception {

		MockHttpServletRequestBuilder mockHttpServletRequestBuilder;
		if (method == HttpMethod.GET) {
			mockHttpServletRequestBuilder = MockMvcRequestBuilders.get(url);
		} else if (method == HttpMethod.POST) {
			mockHttpServletRequestBuilder = MockMvcRequestBuilders.post(url);
		} else if (method == HttpMethod.PUT) {
			mockHttpServletRequestBuilder = MockMvcRequestBuilders.put(url);
		} else {
			mockHttpServletRequestBuilder = MockMvcRequestBuilders.delete(url);
		}

		if (query != null) {
			mockHttpServletRequestBuilder.params(query);
		}
		if (body != null) {
			mockHttpServletRequestBuilder.content(JSON.toJSONString(body));
		}
		if (token != null) {
//			mockHttpServletRequestBuilder.header("Authorization",
//					OAuth2AccessToken.BEARER_TYPE + " " + token);
		}
		mockHttpServletRequestBuilder.accept(MediaType.APPLICATION_JSON)
				.contentType(MediaType.APPLICATION_JSON);

		return mockMvc.perform(mockHttpServletRequestBuilder).andReturn().getResponse();
	}
}
