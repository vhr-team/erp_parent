package cn.ddossec.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

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
     * 单位
     */
    private String amount_unit;

    /**
     * 单价
     */
    private Integer price;

    /**
     * 总金额
     */
    private Integer aggregate;

    /**
     *审核时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date review_time;

    /**
     * 审核状态
     */
    private String checked_audit;

    /**
     * 生成状态
     */
    private String production_generate;


    /**
     * 计划单审核状态
     */
    private String add_status;

    public Production_order(Integer id, String schedule_id, String product_id, String product_name, String product_describe, Integer quantity, String qutbound_order_id, String amount_unit, Integer price, Integer aggregate, Date review_time, String checked_audit, String production_generate, String add_status) {
        this.id = id;
        this.schedule_id = schedule_id;
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_describe = product_describe;
        this.quantity = quantity;
        this.qutbound_order_id = qutbound_order_id;
        this.amount_unit = amount_unit;
        this.price = price;
        this.aggregate = aggregate;
        this.review_time = review_time;
        this.checked_audit = checked_audit;
        this.production_generate = production_generate;
        this.add_status = add_status;
    }
}
