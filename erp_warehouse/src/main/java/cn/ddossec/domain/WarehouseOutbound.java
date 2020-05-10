package cn.ddossec.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * (WarehouseOutbound)实体类
 *
 * @author 谷辉
 * @since 2020-04-22 14:34:41
 */
@Data
@NoArgsConstructor
@TableName(value = "Warehouse_outbound")
public class WarehouseOutbound implements Serializable {
    private static final long serialVersionUID = -35768159757263339L;
    /**
    * 序号
    */
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    /**
    * 出库单编号
    */
    private String outboundId;
    /**
    * 出库人
    */
    private String storer;
    /**
    * 出库理由
    */
    private String reason;
    /**
    * 总件数
    */
    private Integer amountSum;
    /**
    * 总金额
    */
    private Double costPriceSum;
    /**
    * 确认出库总件数
    */
    private Integer paidAmountSum;
    /**
    * 备注
    */
    private String pemark;
    /**
    * 登记人
    */
    private String register;
    /**
    * 登记时间
    */
    private Date registerTime;
    /**
    * 复核人
    */
    private String checker;
    /**
    * 复核时间
    */
    private Date checkTime;
    /**
    * 审核标志
    */
    private String checkTag;
    /**
    * 调度人
    */
    private String attemper;
    /**
    * 调度时间
    */
    private Date attemperTime;
    /**
    * 库存标志
    */
    private String storeTag;

}