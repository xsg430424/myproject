package com.jinjue.demo.interceptor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jinjue.demo.common.utils.UserContextHolder;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * 用户信息拦截器
 */
@Component
@Slf4j
public class UserInterceptor implements HandlerInterceptor {
    /**
     * 服务间调用token用户信息,格式为json
     * {
     * "user_name":"必须有"
     * "自定义key:"value"
     * }
     */
    public static final String X_CLIENT_TOKEN_USER = "x-client-token-user";

     /**
     　　* @description:
     　　* @param 网关转发 头部携带的用户信息
     　　* @return
     　　* @author 张开顺
     　　* @date 2019/3/22 11:05
     　　*/
    public static final String HEAD_USER_INFO="header_user_info";
    public static final String SYSTEM_CODE="systemCode";
    /**
     * 服务间调用的认证token
     */
    public static final String X_CLIENT_TOKEN = "x-client-token";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //从网关获取并校验,通过校验就可信任x-client-token-user中的信息
        checkToken(request.getHeader(X_CLIENT_TOKEN));
        String userInfoString = StringUtils.defaultIfBlank(request.getHeader(HEAD_USER_INFO), "{}");
        String systemCode = StringUtils.defaultIfBlank(request.getHeader(SYSTEM_CODE), "{}");
        Map map = new ObjectMapper().readValue(userInfoString, Map.class);
        map.put(SYSTEM_CODE,systemCode);
        UserContextHolder.getInstance().setContext(map);
        return true;
    }

    private void checkToken(String token) {
        //TODO 从网关获取并校验,通过校验就可信任x-client-token-user中的信息
        log.debug("//TODO 校验token:{}", token);
    }
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
        UserContextHolder.getInstance().clear();
    }
}
