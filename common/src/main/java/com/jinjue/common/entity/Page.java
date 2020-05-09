package com.jinjue.common.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * 分页公共类
 */
@Data
@ApiModel
public class Page {
    //当前页
    @ApiModelProperty(value = "当前页", required = true, dataType = "1")
    @NotNull(message = "pageNum不能为空|pageNum is not null")
    @Min(value = 1, message = "pageNum不能小于1")
    private int pageNum = 1;
    //每页的数量
    @ApiModelProperty(value = "每页的数量", required = true, dataType = "10")
    @NotNull(message = "pageSize|pageSize is not null")
    @Min(value = 1, message = "pageSize")
    private int pageSize = 10;
}
