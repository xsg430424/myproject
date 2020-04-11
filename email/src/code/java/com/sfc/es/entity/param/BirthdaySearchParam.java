/**
 * @Des:
 * @Date: 2019/07/20
 * @Author: Gavin Shaw
 */
@Data
@ApiModel
public class BirthdaySearchParam{
    @ApiModelProperty(name = "生日ID",value = "生日ID")
    private Integer BirId;
    @ApiModelProperty(name = "出生日期",value = "出生日期")
    private Date birthday;
    @ApiModelProperty(name = "创建人",value = "创建人")
    private String createBy;
    @ApiModelProperty(name = "更新时间",value = "更新时间")
    private Date updateTime;
    @ApiModelProperty(name = "创建时间",value = "创建时间")
    private Date createTime;
    @ApiModelProperty(name = "昵称",value = "昵称")
    private String nickname;
    @ApiModelProperty(name = "更新人",value = "更新人")
    private String updateBy;
    @ApiModelProperty(name = "名称",value = "名称")
    private String username;
    @ApiModelProperty(name = "状态1=有效，0=无效",value = "状态1=有效，0=无效")
    private Integer status;
}