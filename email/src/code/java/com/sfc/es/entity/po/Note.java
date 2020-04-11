import java.io.Serializable;
/**
 * @Des:
 * @Date: 2019/07/20
 * @Author: Gavin Shaw
 */
@Data
public class Note{
    /**
    * id
    */
    private Integer Id;
    /**
    * 笔记id
    */
    private Integer noteId;
    /**
    * 更新时间
    */
    private Date updateTime;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 用户id
    */
    private Integer userId;
    /**
    * 备注
    */
    private String description;
    /**
    * 标题
    */
    private String title;
    /**
    * 笔记类型1日报2周报3月报4年报
    */
    private Integer type;
    /**
    * 内容
    */
    private String content;
    /**
    * 状态1=有效，0=无效
    */
    private Integer status;
}