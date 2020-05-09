package com.jinjue.demo.config;

import com.jinjue.demo.common.config.DefaultCorsFilter;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @des
 * @date 2019/7/7 13:40
 * @auther xiaoshuigeng
 */
@Component
public class SimpleCorsFilter extends DefaultCorsFilter {
    private static final String ALLOWED_HEADERS = "x-requested-with, authorization, Content-Type, Authorization, credential, X-XSRF-TOKEN, systemCode, sfcLang, hostIp, Origin, Accept, Access-Control-Request-Method,Access-Control-Request-Headers";

    public SimpleCorsFilter() {
    }

    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse)res;
        HttpServletRequest request = (HttpServletRequest)req;
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with, authorization, Content-Type, Authorization, credential, X-XSRF-TOKEN, systemCode, sfcLang, hostIp, Origin, Accept, Access-Control-Request-Method,Access-Control-Request-Headers");
        if (request.getMethod().equals(HttpMethod.OPTIONS.name())) {
            response.setStatus(HttpStatus.NO_CONTENT.value());
        } else {
            chain.doFilter(req, res);
        }

    }

    public void init(FilterConfig filterConfig) {
    }

    public void destroy() {
    }
}
