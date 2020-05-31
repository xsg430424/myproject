package com.jinjue.demo.excel.util;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/** 系统全局工具类 */
public class ContextUtil {

  /**
   * 获取当前request
   *
   * @return
   */
  public static HttpServletRequest getRequest() {
    ServletRequestAttributes attrs =
        (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
    if (attrs == null) {
      return null;
    }
    return attrs.getRequest();
  }
  /**
   * 获取当前response
   *
   * @return
   */
  public static HttpServletResponse getResponse() {
    ServletRequestAttributes attrs =
        (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
    if (attrs == null) {
      return null;
    }
    return attrs.getResponse();
  }

  /**
   * 获取当前session
   *
   * @return
   */
  public static HttpSession getSession() {
    ServletRequestAttributes attrs =
        (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
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
  /*public static String getLanguage(HttpServletRequest request) {
    String language = "";
    try {
      language = request.getHeader(SystemConstant.HEADER_SFC_LANG);
      if (StringUtils.isBlank(language)) {
        language = Lang.zh.name();
      }
    } catch (Exception e) {
      language = Lang.zh.name();
    }
    return language;
  }*/
}
