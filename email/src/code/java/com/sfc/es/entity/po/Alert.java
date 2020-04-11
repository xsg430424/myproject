import java.io.Serializable;
/**
 * @Des:
 * @Date: 2019/07/20
 * @Author: Gavin Shaw
 */
@Data
public class Alert{
    /**
    * 提醒ID
    */
    private Integer AlertId;
    /**
    * 提醒结束时间
    */
    private Date alertEndTime;
    /**
    * 创建人
    */
    private String createBy;
    /**
    * 更新时间
    */
    private Date updateTime;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 提醒开始时间
    */
    private Date alertStartTime;
    /**
    * 备注
    */
    private String description;
    /**
    * 更新人
    */
    private String updateBy;
    /**
    * 提醒名称
    */
    private String alertName;
    /**
    * 提醒类型1每日任务2每周任务3每月任务4每年任务5生日6交房租7还花呗信用卡8领取公积金
    */
    private Integer alertType;
    /**
    * 状态1=有效，0=无效
    */
    private Integer status;
}