package com.sfc.es.entity.po;

import lombok.Data;

import java.util.Date;

/**
 * @Des:
 * @Date: 2019/07/07
 * @Author: Gavin Shaw
 */
@Data
public class Message {
    /**
     * id
     */
    private int id;
    /**
     * 用户id
     */
    private int userId;
    /**
     * 标题
     */
    private String title;
    /**
     * 内容
     */
    private String content;
    /**
     * 信息类型1帐号2linux3ES
     */
    private int type;
    /**
     * 状态1=有效，0=无效
     */
    private int status=1;
    /**
     * 备注
     */
    private String description;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
}
