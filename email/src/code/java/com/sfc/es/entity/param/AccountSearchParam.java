/**
 * @Des:
 * @Date: 2019/07/20
 * @Author: Gavin Shaw
 */
@Data
@ApiModel
public class AccountSearchParam{
    @ApiModelProperty(name = "帐号ID",value = "帐号ID")
    private Integer AccountId;
    @ApiModelProperty(name = "创建时间",value = "创建时间")
    private Date createTime;
    @ApiModelProperty(name = "网站名称",value = "网站名称")
    private String siteName;
    @ApiModelProperty(name = "备注",value = "备注")
    private String description;
    @ApiModelProperty(name = "类型",value = "类型")
    private Integer type;
    @ApiModelProperty(name = "网址",value = "网址")
    private String url;
    @ApiModelProperty(name = "创建人",value = "创建人")
    private String createBy;
    @ApiModelProperty(name = "密码",value = "密码")
    private String password;
    @ApiModelProperty(name = "更新时间",value = "更新时间")
    private Date updateTime;
    @ApiModelProperty(name = "用户ID",value = "用户ID")
    private Integer userId;
    @ApiModelProperty(name = "更新人",value = "更新人")
    private String updateBy;
    @ApiModelProperty(name = "用户名",value = "用户名")
    private String username;
    @ApiModelProperty(name = "状态1=有效，0=无效",value = "状态1=有效，0=无效")
    private Integer status;
}