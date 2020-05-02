package cn.ddossec.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * (WarehouseInbound)实体类
 *
 * @author 谷辉
 * @since 2020-04-24 17:06:41
 */
@Data
@NoArgsConstructor
@TableName(value = "Warehouse_inbound")
public class WarehouseInbound implements Serializable {
    private static final long serialVersionUID = -51353765254939309L;
    /**
    * 序号
    */
    private Integer id;
    /**
    * 入库单编号
    */
    private String inboundId;
    /**
    * 入库人
    */
    private String storer;
    /**
    * 入库理由
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
    * 确认入库总件数
    */
    private Integer gatheredAmountSum;
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