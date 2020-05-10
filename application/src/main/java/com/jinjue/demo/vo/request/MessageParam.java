package com.jinjue.demo.vo.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * @Des:
 * @Date: 2019/07/07
 * @Author: Gavin Shaw
 */
@Data
@ApiModel
public class MessageParam{
    @ApiModelProperty(name = "id",value = "id")
    private int id;
    @ApiModelProperty(name = "用户id",value = "用户id")
    private int userId;
    @ApiModelProperty(name = "内容",value = "内容")
    private String content;
    @ApiModelProperty(name = "信息类型1帐号2linux3ES",value = "信息类型1帐号2linux3ES")
    private int type;
}
