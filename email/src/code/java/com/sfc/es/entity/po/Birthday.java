import java.io.Serializable;
/**
 * @Des:
 * @Date: 2019/07/20
 * @Author: Gavin Shaw
 */
@Data
public class Birthday{
    /**
    * 生日ID
    */
    private Integer BirId;
    /**
    * 出生日期
    */
    private Date birthday;
    /**
    * 创建人
    */
    private String createBy;
    /**
    * 更新时间
    */
    private Date updateTime;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 昵称
    */
    private String nickname;
    /**
    * 更新人
    */
    private String updateBy;
    /**
    * 名称
    */
    private String username;
    /**
    * 状态1=有效，0=无效
    */
    private Integer status;
}