/**
 * @Des:
 * @Date: 2019/07/20
 * @Author: Gavin Shaw
 */
@Data
@ApiModel
public class AssetSearchParam{
    @ApiModelProperty(name = "资产ID",value = "资产ID")
    private Integer AssetId;
    @ApiModelProperty(name = "每月收入",value = "每月收入")
    private BigDecimal income;
    @ApiModelProperty(name = "创建人",value = "创建人")
    private String createBy;
    @ApiModelProperty(name = "更新时间",value = "更新时间")
    private Date updateTime;
    @ApiModelProperty(name = "创建时间",value = "创建时间")
    private Date createTime;
    @ApiModelProperty(name = "用户ID",value = "用户ID")
    private Integer userId;
    @ApiModelProperty(name = "每月支出",value = "每月支出")
    private BigDecimal expend;
    @ApiModelProperty(name = "每月存款",value = "每月存款")
    private BigDecimal deposit;
    @ApiModelProperty(name = "备注",value = "备注")
    private String description;
    @ApiModelProperty(name = "更新人",value = "更新人")
    private String updateBy;
    @ApiModelProperty(name = "状态1=有效，0=无效",value = "状态1=有效，0=无效")
    private Integer status;
}