package cn.ddossec.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 订单表
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@TableName(value = "bus_orderModel")
public class OrderModel implements Serializable {
    /**
     * 订单ID
     */
    @TableId(value = "order_id", type = IdType.AUTO)
    private Integer orderId;

    /**
     * 订单号
     */
    @TableField(value = "order_num")
    private String orderNum;

    /**
     * 订单创建人(id)
     */
    @TableField(value = "creater")
    private Integer creater;

    /**
     * 订单创建时间
     */
    @TableField(value = "creater_time")
    private Date createrTime;

    /**
     * 订单审核人(id)
     */
    @TableField(value = "checker")
    private Integer checker;

    /**
     * 订单审核时间
     */
    @TableField(value = "check_time")
    private Date checkTime;

    /**
     * 订单负责人(ID）
     */
    @TableField(value = "completer")
    private Integer completer;

    /**
     * 订单结束时间
     */
    @TableField(value = "end_time")
    private Date endTime;

    /**
     * 订单类型
     */
    @TableField(value = "order_type")
    private Integer orderType;

    /**
     * 订单状态
     */
    @TableField(value = "order_state")
    private Integer orderState;

    /**
     * 订单商品总数
     */
    @TableField(value = "total_num")
    private Integer totalNum;

    /**
     * 订单商品总价
     */
    @TableField(value = "total_price")
    private Double totalPrice;

    /**
     * 供应商ID
     */
    @TableField(value = "supplier_id")
    private Integer supplierId;

    @TableField(exist = false)
    private String supplierName;

    @TableField(exist = false)
    private String checkerName;

    // 订单明细
    @TableField(exist = false)
    private List<OrderDetail> details;

    @TableField(exist = false)
    private Integer[] productTypeId;

    @TableField(exist = false)
    private Integer[] goodsId;

    @TableField(exist = false)
    private Integer[] detailNum;

    @TableField(exist = false)
    private Double[] detailPrice;

    private static final long serialVersionUID = 1L;

    public static final String COL_ORDER_ID = "order_id";

    public static final String COL_ORDER_NUM = "order_num";

    public static final String COL_CREATER = "creater";

    public static final String COL_CREATER_TIME = "creater_time";

    public static final String COL_CHECKER = "checker";

    public static final String COL_CHECK_TIME = "check_time";

    public static final String COL_COMPLETER = "completer";

    public static final String COL_END_TIME = "end_time";

    public static final String COL_ORDER_TYPE = "order_type";

    public static final String COL_ORDER_STATE = "order_state";

    public static final String COL_TOTAL_NUM = "total_num";

    public static final String COL_TOTAL_PRICE = "total_price";

    public static final String COL_SUPPLIER_ID = "supplier_id";
}