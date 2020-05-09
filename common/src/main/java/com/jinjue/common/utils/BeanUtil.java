package com.jinjue.common.utils;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 工具类复制
 */
@Log4j2
public class BeanUtil {
    private BeanUtil() {
    }

    /**
     * 复制，并创建对象
     */
    public static <T> T copyObject(Object o, Class<T> cla) {
        try {
            T t = cla.newInstance();
            BeanUtils.copyProperties(o, t);
            return t;
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
        return null;
    }

    /**
     * 复制list
     */
    public static <T, S> List<T> copyList(List<S> list, Class<T> clazz) {
        return list.stream().map(s -> {
            T t = null;
            try {
                t = clazz.newInstance();
                BeanUtils.copyProperties(s, t);
            } catch (Exception e) {
                log.error(e.getMessage(), e);
            }
            return t;
        }).collect(Collectors.toList());
    }

    /**
     * 复制，并创建PageInfo
     */
    public static <T, K> PageInfo<T> copyPageInfo(PageInfo<K> page, Class<T> cla) {
        PageInfo<T> resultPageInfo = new PageInfo<>();
        BeanUtils.copyProperties(page, resultPageInfo);
        resultPageInfo.setList(copyList(page.getList(), cla));
        return resultPageInfo;
    }


}
