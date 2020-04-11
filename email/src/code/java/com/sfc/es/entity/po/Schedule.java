import java.io.Serializable;
/**
 * @Des:
 * @Date: 2019/07/20
 * @Author: Gavin Shaw
 */
@Data
public class Schedule{
    /**
    * 计划ID
    */
    private Integer ScheduleId;
    /**
    * 创建人
    */
    private String createBy;
    /**
    * 更新时间
    */
    private Date updateTime;
    /**
    * 计划时间
    */
    private Date scheduleTime;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 备注
    */
    private String description;
    /**
    * 更新人
    */
    private String updateBy;
    /**
    * 计划名称
    */
    private String scheduleName;
    /**
    * 状态1=有效，0=无效
    */
    private Integer status;
}