import java.io.Serializable;
/**
 * @Des:
 * @Date: 2019/07/20
 * @Author: Gavin Shaw
 */
@Data
public class User{
    /**
    * id
    */
    private Integer Id;
    /**
    * 出生日期
    */
    private String birthday;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 性别F女M男
    */
    private String sex;
    /**
    * 备注
    */
    private String description;
    /**
    * 联系电话
    */
    private String telephone;
    /**
    * 密码
    */
    private String password;
    /**
    * 更新时间
    */
    private Date updateTime;
    /**
    * 用户id
    */
    private Integer userId;
    /**
    * 角色id1超级管理员2普通用户
    */
    private Integer roleId;
    /**
    * 联系手机号
    */
    private String mobilePhone;
    /**
    * 最后登录时间
    */
    private Date lastLoginDatetime;
    /**
    * 身份证号
    */
    private String certificatenum;
    /**
    * 姓名
    */
    private String nameCn;
    /**
    * 邮箱
    */
    private String email;
    /**
    * 用户名
    */
    private String username;
    /**
    * 英文名
    */
    private String nameEn;
    /**
    * 数据状态1=有效，0=无效
    */
    private Integer status;
}