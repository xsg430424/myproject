package com.jinjue.demo.excel.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 职位权限导出实体
 *
 * <p>
 *
 * @author 肖水庚
 * @version 1.0.0
 * @date 2019/3/7
 */
@Data
@ApiModel
public class UserRightExportVo {

  @ApiModelProperty("用户权限Id")
  private Integer urId;

  @ApiModelProperty("用户职位名称")
  private String upName;

  @ApiModelProperty("用户权限名称")
  private String urName;

  @ApiModelProperty("权限Module")
  private String urModule;

  @ApiModelProperty("菜单链接")
  private String urUrl;
}
