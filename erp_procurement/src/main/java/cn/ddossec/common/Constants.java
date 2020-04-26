package cn.ddossec.common;

/**
 * 常量接口
 */
public interface Constants {

    /* 采购订单 */
    public static final String ORDER_TYPE_BUY = "1";

    /* 运输单 */
    public static final String ORDER_TYPE_TRANS = "2";

    /* 入库单 */
    public static final String ORDER_TYPE_INSTOCK = "3";

    /* 销售单 */
    public static final String ORDER_TYPE_SALES = "4";

    /**
     * 采购单状态
     */
    public static final String ORDER_TYPE_BUY_AUDIT = "1";// 未审核
    public static final String ORDER_TYPE_BUY_AUDIT_REJECT = "2";// 审核未通过
    public static final String ORDER_TYPE_BUY_AUDIT_PASS = "3";// 审核通过

    /**
     * 运输单状态
     */
    public static final String ORDER_TYPE_TRANS_BUY = "1";// 运输单待采购
    public static final String ORDER_TYPE_TRANS_ASSGIN = "2";// 运输单派单
    public static final String ORDER_TYPE_TRANS_BUYING = "3";// 正在采购

    /**
     * 入库单状态
     */
    public static final String ORDER_TYPE_INSTOCK_WAIT = "1";// 待入库
    public static final String ORDER_TYPE_INSTOCK_INING = "2";// 入库中
    public static final String ORDER_TYPE_INSTOCK_FINISH = "3";// 入库完成
}