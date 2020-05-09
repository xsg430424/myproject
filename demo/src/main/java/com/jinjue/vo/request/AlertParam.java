package com.jinjue.vo.request;

import lombok.Data;

import java.util.Date;

@Data
public class AlertParam {
    /**
     * 提醒ID
     */
    private int alertId;
    /**
     * 提醒名称
     */
    private String alertName;
    /**
     * 提醒开始时间
     */
    private Date alertStartTime;
    /**
     * 提醒结束时间
     */
    private Date alertEndTime;
    /**
     * 提醒类型1每日任务2每周任务3每月任务4每年任务5生日6交房租7还花呗信用卡8领取公积金
     */
    private int alertType;
    /**
     * 状态1=有效，0=无效
     */
    private int status;
    /**
     * 备注
     */
    private String description;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 创建人
     */
    private String createBy;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 更新人
     */
    private String updateBy;
}
