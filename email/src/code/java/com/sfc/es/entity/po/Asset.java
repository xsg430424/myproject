import java.io.Serializable;
/**
 * @Des:
 * @Date: 2019/07/20
 * @Author: Gavin Shaw
 */
@Data
public class Asset{
    /**
    * 资产ID
    */
    private Integer AssetId;
    /**
    * 每月收入
    */
    private BigDecimal income;
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
    * 用户ID
    */
    private Integer userId;
    /**
    * 每月支出
    */
    private BigDecimal expend;
    /**
    * 每月存款
    */
    private BigDecimal deposit;
    /**
    * 备注
    */
    private String description;
    /**
    * 更新人
    */
    private String updateBy;
    /**
    * 状态1=有效，0=无效
    */
    private Integer status;
}