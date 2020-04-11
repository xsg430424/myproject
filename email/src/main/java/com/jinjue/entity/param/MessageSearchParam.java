package com.sfc.es.entity.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
/**
 * @Des:
 * @Date: 2019/07/07
 * @Author: Gavin Shaw
 */
@Data
@ApiModel
public class MessageSearchParam{
    @ApiModelProperty(name = "id",value = "id")
    private int id;
    @ApiModelProperty(name = "用户id",value = "用户id")
    private int userId;
    @ApiModelProperty(name = "标题",value = "标题")
    private String title;
    @ApiModelProperty(name = "内容",value = "内容")
    private String content;
    @ApiModelProperty(name = "信息类型1帐号2linux3ES",value = "信息类型1帐号2linux3ES")
    private int type;
    @ApiModelProperty(name = "状态1=有效，0=无效",value = "状态1=有效，0=无效")
    private int status;
    @ApiModelProperty(name = "备注",value = "备注")
    private String description;
    @ApiModelProperty(name = "创建时间",value = "创建时间")
    private Date createTime;
    @ApiModelProperty(name = "更新时间",value = "更新时间")
    private Date updateTime;
}
