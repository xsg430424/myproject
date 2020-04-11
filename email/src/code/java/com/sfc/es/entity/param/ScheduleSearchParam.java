/**
 * @Des:
 * @Date: 2019/07/20
 * @Author: Gavin Shaw
 */
@Data
@ApiModel
public class ScheduleSearchParam{
    @ApiModelProperty(name = "计划ID",value = "计划ID")
    private Integer ScheduleId;
    @ApiModelProperty(name = "创建人",value = "创建人")
    private String createBy;
    @ApiModelProperty(name = "更新时间",value = "更新时间")
    private Date updateTime;
    @ApiModelProperty(name = "计划时间",value = "计划时间")
    private Date scheduleTime;
    @ApiModelProperty(name = "创建时间",value = "创建时间")
    private Date createTime;
    @ApiModelProperty(name = "备注",value = "备注")
    private String description;
    @ApiModelProperty(name = "更新人",value = "更新人")
    private String updateBy;
    @ApiModelProperty(name = "计划名称",value = "计划名称")
    private String scheduleName;
    @ApiModelProperty(name = "状态1=有效，0=无效",value = "状态1=有效，0=无效")
    private Integer status;
}