package com.sfc.xxljobexecutor.config;

//import com.sfc.common.date.DateUtil;
//import com.bben.common.util.IpConvert;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sfc.common.util.IpConvert;
import com.sfc.common.util.date.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

/**
 * Controller 的所有方法在执行前后都会进入functionAccessCheck方法
 *
 * @author
 */
@Aspect
@Configuration
@Slf4j
public class AOPConfig {

    @Autowired
    ObjectMapper objectMapper;

    //    @Around("@within(org.springframework.web.bind.annotation.RestController)")
//    @Around("@within(org.springframework.stereotype.Controller)")
    @Around("execution(* com.sfc.xxljobexecutor.rest..*(..))")
    public Object functionAccessCheck(final ProceedingJoinPoint pjp) throws Throwable {
        try {
            log.info("------Begin-----------:" + DateUtil.detailNowTime());
            HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();

            // 请求的IP
            String ip = IpConvert.getIpAddress(request);
            String url = request.getRequestURI();
            String targetName = pjp.getTarget().getClass().getName();
            String getMethod = request.getMethod();
            // 获取方法名
            String methodName = pjp.getSignature().getName();

            log.info("ip: " + ip + "\r\nurl: " + url + "\r\ntargetName: " + targetName
                    + "\r\ngetMethod: " + getMethod + "\r\nMethodName: " + methodName);

//            Object[] args = pjp.getArgs();

            // 获取输入参数
            String requestContent = "";
            List<Object> listArgs = Arrays.asList(pjp.getArgs());

            try {
                requestContent = (new ObjectMapper()).writeValueAsString(listArgs);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            log.info("Input args:" + requestContent);
            Object o = pjp.proceed();

            log.info("Output return :" + objectMapper.writeValueAsString(o));
            log.info("------End-----------:" + DateUtil.detailNowTime());
            return o;
        } catch (Throwable e) {
            throw e;
        }
    }
}
