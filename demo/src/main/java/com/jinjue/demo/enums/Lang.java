package com.jinjue.demo.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 多语言
 */
@AllArgsConstructor
@Getter
public enum Lang {
    zh("zh-CN", "zh.*"),
    en("en-US", "en.*");
    /**
     * 全称
     */
    private String full;
    /**
     * 匹配规则
     */
    private String match;

    public static Lang getLangByName(String name) {
        for (Lang lang : values()) {
            if (lang.name().equals(name)) {
                return lang;
            }
        }
        return null;
    }

}
