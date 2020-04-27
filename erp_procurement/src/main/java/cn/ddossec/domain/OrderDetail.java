package cn.ddossec.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
    * 订单明细
    */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "bus_orderDetail")
public class OrderDetail implements Serializable {
    /**
     * 订单详细id
     */
    @TableId(value = "order_detail_id", type = IdType.AUTO)
    private Integer orderDetailId;

    /**
     * 商品总数目
     */
    @TableField(value = "detail_num")
    private Integer detailNum;

    /**
     * 商品进价单价
     */
    @TableField(value = "detail_price")
    private Double detailPrice;

    /**
     * 商品id
     */
    @TableField(value = "product_id")
    private Integer productId;

    /**
     * 订单id
     */
    @TableField(value = "order_id")
    private Integer orderId;

    /**
     * 剩余数目
     */
    @TableField(value = "surplus")
    private Integer surplus;

    @TableField(exist = false)
    private Goods goods;

    private static final long serialVersionUID = 1L;

    public static final String COL_ORDER_DETAIL_ID = "order_detail_id";

    public static final String COL_DETAIL_NUM = "detail_num";

    public static final String COL_DETAIL_PRICE = "detail_price";

    public static final String COL_PRODUCT_ID = "product_id";

    public static final String COL_ORDER_ID = "order_id";

    public static final String COL_SURPLUS = "surplus";
}