/**
 * @Des:
 * @Date: 2019/07/20
 * @Author: Gavin Shaw
 */
@Data
@ApiModel
public class NoteParam{
    @ApiModelProperty(name = "id",value = "id")
    private Integer Id;
    @ApiModelProperty(name = "笔记id",value = "笔记id")
    private Integer noteId;
    @ApiModelProperty(name = "更新时间",value = "更新时间")
    private Date updateTime;
    @ApiModelProperty(name = "创建时间",value = "创建时间")
    private Date createTime;
    @ApiModelProperty(name = "用户id",value = "用户id")
    private Integer userId;
    @ApiModelProperty(name = "备注",value = "备注")
    private String description;
    @ApiModelProperty(name = "标题",value = "标题")
    private String title;
    @ApiModelProperty(name = "笔记类型1日报2周报3月报4年报",value = "笔记类型1日报2周报3月报4年报")
    private Integer type;
    @ApiModelProperty(name = "内容",value = "内容")
    private String content;
    @ApiModelProperty(name = "状态1=有效，0=无效",value = "状态1=有效，0=无效")
    private Integer status;
}