package cn.ddossec.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (WarehouseInboundDetailed)实体类
 *
 * @author 谷辉
 * @since 2020-04-24 17:08:29
 */
@Data
@NoArgsConstructor
@TableName("Warehouse_inbound_detailed")
public class WarehouseInboundDetailed implements Serializable {
    private static final long serialVersionUID = -75766736646811826L;
    /**
    * 序号
    */
    @TableId(value = "id", type = IdType.AUTO)
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
    * 确认入库件数
    */
    private Integer gatheredAmount;
    /**
    * 入库标志
    */
    private String gatherTag;

}