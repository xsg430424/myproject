import java.io.Serializable;
/**
 * @Des:
 * @Date: 2019/07/20
 * @Author: Gavin Shaw
 */
@Data
public class Contact{
    /**
    * 联系人ID
    */
    private Integer ContactId;
    /**
    * 出生日期
    */
    private String birthday;
    /**
    * 地址
    */
    private String address;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 性别
    */
    private Integer sex;
    /**
    * 备注
    */
    private String description;
    /**
    * 联系电话
    */
    private String telephone;
    /**
    * 关系类型1=亲人，2=朋友，3=同学，4=熟人
    */
    private Integer type;
    /**
    * 创建人
    */
    private String createBy;
    /**
    * 更新时间
    */
    private Date updateTime;
    /**
    * 用户ID
    */
    private Integer userId;
    /**
    * 联系手机号
    */
    private String mobilePhone;
    /**
    * 昵称
    */
    private String nickname;
    /**
    * 全名
    */
    private String fullname;
    /**
    * 与本人的关系
    */
    private String appellation;
    /**
    * 身份证号
    */
    private String certificatenum;
    /**
    * 更新人
    */
    private String updateBy;
    /**
    * 状态1=有效，0=无效
    */
    private Integer status;
}