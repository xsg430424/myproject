package com.jinjue.demo.vo.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Des:
 * @Date: 2019/07/20
 * @Author: Gavin Shaw
 */
@Data
@ApiModel
public class AccountParam{
    @ApiModelProperty(name = "帐号ID",value = "帐号ID")
    private Integer accountId;
    @ApiModelProperty(name = "网站名称",value = "网站名称")
    private String siteName;
    @ApiModelProperty(name = "类型",value = "类型")
    private Integer type;
    @ApiModelProperty(name = "网址",value = "网址")
    private String url;
    @ApiModelProperty(name = "密码",value = "密码")
    private String password;
    @ApiModelProperty(name = "用户ID",value = "用户ID")
    private Integer userId;
    @ApiModelProperty(name = "用户名",value = "用户名")
    private String username;
}