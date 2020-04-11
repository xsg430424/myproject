package com.jinjue.demo.utils;

/**
 * 系统全局工具类
 */
public class ContextUtil {
    /**
     * 多语言language参数名
     */
    public static final String LANGUAGE_PARAM = "sfc-lang";


    /**
     * 获取当前request
     *
     * @return
     */
    public static HttpServletRequest getRequest() {
        ServletRequestAttributes attrs = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if (attrs == null) {
            return null;
        }
        return attrs.getRequest();
    }

    /**
     * 获取当前session
     *
     * @return
     */
    public static HttpSession getSession() {
        ServletRequestAttributes attrs = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if (attrs == null) {
            return null;
        }
        return attrs.getRequest().getSession(false);
    }


    /**
     * 获取当前language
     *
     * @param request
     * @return
     */
    public static String getLanguage(HttpServletRequest request) {
        return request.getHeader(LANGUAGE_PARAM);
    }

}
