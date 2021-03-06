package com.jinjue.demo.common.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.error.AbstractErrorController;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
@Controller
*/
@Slf4j
public class DefaultErrorController extends AbstractErrorController {
	private static final String ERROR_PATH = "/error";

	@Autowired
    ObjectMapper objectMapper;
	public DefaultErrorController() {
		super(new DefaultErrorAttributes());
	}

	@RequestMapping(ERROR_PATH)
	public void getErrorPath(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> model = Collections.unmodifiableMap(getErrorAttributes(
				request, false));
		Throwable cause =getCause(request);
		int status =  (Integer)model.get("status");
		//错误信息
		String message = (String)model.get("message");

		//后台打印日志信息方方便查错
		log.error(message, cause);
		response.setStatus(status);
		Map error = new HashMap();
		error.put("code", status);
		error.put("message", message);
		error.put("data", "");
		error.put("timestamp", System.currentTimeMillis());

		writeJson(response,error);
	}

	protected void writeJson(HttpServletResponse response, Map error){
		response.setContentType("application/json;charset=utf-8");
		try {
			response.getWriter().write(objectMapper.writeValueAsString(error));
		} catch (IOException e) {
			// ignore
		}
	}
	
	protected Throwable getCause(HttpServletRequest request) {
		Throwable error = (Throwable)request.getAttribute("javax.servlet.error.exception");
		if (error != null) {
			while (error instanceof ServletException && error.getCause() != null) {
				error = ((ServletException) error).getCause();
			}
		}
		return error;
	}

	@Override
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return null;
	}
}