/**
 * @Des:
 * @Date: 2019/07/20
 * @Author: Gavin Shaw
 */
@Data
@ApiModel
public class UserParam{
    @ApiModelProperty(name = "id",value = "id")
    private Integer Id;
    @ApiModelProperty(name = "出生日期",value = "出生日期")
    private String birthday;
    @ApiModelProperty(name = "创建时间",value = "创建时间")
    private Date createTime;
    @ApiModelProperty(name = "性别F女M男",value = "性别F女M男")
    private String sex;
    @ApiModelProperty(name = "备注",value = "备注")
    private String description;
    @ApiModelProperty(name = "联系电话",value = "联系电话")
    private String telephone;
    @ApiModelProperty(name = "密码",value = "密码")
    private String password;
    @ApiModelProperty(name = "更新时间",value = "更新时间")
    private Date updateTime;
    @ApiModelProperty(name = "用户id",value = "用户id")
    private Integer userId;
    @ApiModelProperty(name = "角色id1超级管理员2普通用户",value = "角色id1超级管理员2普通用户")
    private Integer roleId;
    @ApiModelProperty(name = "联系手机号",value = "联系手机号")
    private String mobilePhone;
    @ApiModelProperty(name = "最后登录时间",value = "最后登录时间")
    private Date lastLoginDatetime;
    @ApiModelProperty(name = "身份证号",value = "身份证号")
    private String certificatenum;
    @ApiModelProperty(name = "姓名",value = "姓名")
    private String nameCn;
    @ApiModelProperty(name = "邮箱",value = "邮箱")
    private String email;
    @ApiModelProperty(name = "用户名",value = "用户名")
    private String username;
    @ApiModelProperty(name = "英文名",value = "英文名")
    private String nameEn;
    @ApiModelProperty(name = "数据状态1=有效，0=无效",value = "数据状态1=有效，0=无效")
    private Integer status;
}