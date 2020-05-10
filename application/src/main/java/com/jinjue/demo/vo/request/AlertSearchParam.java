package com.jinjue.demo.vo.request;

import lombok.Data;

import java.util.Date;

@Data
public class AlertSearchParam {
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
}
