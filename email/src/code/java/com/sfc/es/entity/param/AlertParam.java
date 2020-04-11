/**
 * @Des:
 * @Date: 2019/07/20
 * @Author: Gavin Shaw
 */
@Data
@ApiModel
public class AlertParam{
    @ApiModelProperty(name = "提醒ID",value = "提醒ID")
    private Integer AlertId;
    @ApiModelProperty(name = "提醒结束时间",value = "提醒结束时间")
    private Date alertEndTime;
    @ApiModelProperty(name = "创建人",value = "创建人")
    private String createBy;
    @ApiModelProperty(name = "更新时间",value = "更新时间")
    private Date updateTime;
    @ApiModelProperty(name = "创建时间",value = "创建时间")
    private Date createTime;
    @ApiModelProperty(name = "提醒开始时间",value = "提醒开始时间")
    private Date alertStartTime;
    @ApiModelProperty(name = "备注",value = "备注")
    private String description;
    @ApiModelProperty(name = "更新人",value = "更新人")
    private String updateBy;
    @ApiModelProperty(name = "提醒名称",value = "提醒名称")
    private String alertName;
    @ApiModelProperty(name = "提醒类型1每日任务2每周任务3每月任务4每年任务5生日6交房租7还花呗信用卡8领取公积金",value = "提醒类型1每日任务2每周任务3每月任务4每年任务5生日6交房租7还花呗信用卡8领取公积金")
    private Integer alertType;
    @ApiModelProperty(name = "状态1=有效，0=无效",value = "状态1=有效，0=无效")
    private Integer status;
}