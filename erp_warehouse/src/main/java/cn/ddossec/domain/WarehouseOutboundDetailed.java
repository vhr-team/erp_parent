package cn.ddossec.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (WarehouseOutboundDetailed)实体类
 *
 * @author 谷辉
 * @since 2020-04-22 15:33:29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WarehouseOutboundDetailed implements Serializable {
    private static final long serialVersionUID = 411946510552235167L;
    /**
    * 序号
    */
    private Integer id;
    /**
    * 父级序号
    */
    private Integer parentId;
    /**
    * 产品编号
    */
    private String productId;
    /**
    * 产品名称
    */
    private String productName;
    /**
    * 描述
    */
    private String productDescribe;
    /**
    * 数量
    */
    private Integer amount;
    /**
    * 单位
    */
    private String amountUnit;
    /**
    * 单价
    */
    private Double costPrice;
    /**
    * 小计
    */
    private Integer subtotal;
    /**
    * 确认出库件数
    */
    private Integer paidAmount;
    /**
    * 出库标志
    */
    private String payTag;

    /**
     * 出库表
     */
    private WarehouseOutbound warehouseOutbound;

}