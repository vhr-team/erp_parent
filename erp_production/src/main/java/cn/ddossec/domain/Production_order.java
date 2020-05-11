package cn.ddossec.domain;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class Production_order {

    /**
     *序
     */
    private Integer id;

    /**
     *计划单编号
     */
    private String schedule_id;

    /**
     *产品编号
     */
    private String product_id;

    /**
     *产品名称
     */
    private String product_name;

    /**
     *描述
     */
    private String product_describe;

    /**
     *数量
     */
    private Integer quantity;

    /**
     *出库单编号
     */
    private String qutbound_order_id;

    /**
     *审核时间
     */
    private Date review_time;

    public Production_order(Integer id, String schedule_id, String product_id, String product_name, String product_describe, Integer quantity, String qutbound_order_id, Date review_time) {
        this.id = id;
        this.schedule_id = schedule_id;
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_describe = product_describe;
        this.quantity = quantity;
        this.qutbound_order_id = qutbound_order_id;
        this.review_time = review_time;
    }
}
