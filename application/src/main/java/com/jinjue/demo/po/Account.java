package com.jinjue.demo.po;

import lombok.Data;

import java.util.Date;

/**
 * @Des:
 * @Date: 2019/07/20
 * @Author: Gavin Shaw
 */
@Data
public class Account{
    /**
    * 帐号ID
    */
    private Integer accountId;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 网站名称
    */
    private String siteName;
    /**
    * 备注
    */
    private String description;
    /**
    * 类型
    */
    private Integer type;
    /**
    * 网址
    */
    private String url;
    /**
    * 创建人
    */
    private String createBy;
    /**
    * 密码
    */
    private String password;
    /**
    * 更新时间
    */
    private Date updateTime;
    /**
    * 用户ID
    */
    private Integer userId;
    /**
    * 更新人
    */
    private String updateBy;
    /**
    * 用户名
    */
    private String username;
    /**
    * 状态1=有效，0=无效
    */
    private Integer status;
}