/**
 * @Des:
 * @Date: 2019/07/20
 * @Author: Gavin Shaw
 */
@Data
@ApiModel
public class ContactParam{
    @ApiModelProperty(name = "联系人ID",value = "联系人ID")
    private Integer ContactId;
    @ApiModelProperty(name = "出生日期",value = "出生日期")
    private String birthday;
    @ApiModelProperty(name = "地址",value = "地址")
    private String address;
    @ApiModelProperty(name = "创建时间",value = "创建时间")
    private Date createTime;
    @ApiModelProperty(name = "性别",value = "性别")
    private Integer sex;
    @ApiModelProperty(name = "备注",value = "备注")
    private String description;
    @ApiModelProperty(name = "联系电话",value = "联系电话")
    private String telephone;
    @ApiModelProperty(name = "关系类型1=亲人，2=朋友，3=同学，4=熟人",value = "关系类型1=亲人，2=朋友，3=同学，4=熟人")
    private Integer type;
    @ApiModelProperty(name = "创建人",value = "创建人")
    private String createBy;
    @ApiModelProperty(name = "更新时间",value = "更新时间")
    private Date updateTime;
    @ApiModelProperty(name = "用户ID",value = "用户ID")
    private Integer userId;
    @ApiModelProperty(name = "联系手机号",value = "联系手机号")
    private String mobilePhone;
    @ApiModelProperty(name = "昵称",value = "昵称")
    private String nickname;
    @ApiModelProperty(name = "全名",value = "全名")
    private String fullname;
    @ApiModelProperty(name = "与本人的关系",value = "与本人的关系")
    private String appellation;
    @ApiModelProperty(name = "身份证号",value = "身份证号")
    private String certificatenum;
    @ApiModelProperty(name = "更新人",value = "更新人")
    private String updateBy;
    @ApiModelProperty(name = "状态1=有效，0=无效",value = "状态1=有效，0=无效")
    private Integer status;
}