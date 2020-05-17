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
     *审核时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date review_time;

    private String checked_audit;


    public Production_order(Integer id, String schedule_id, String product_id, String product_name, String product_describe, Integer quantity, String qutbound_order_id, Date review_time, String checked_audit) {
        this.id = id;
        this.schedule_id = schedule_id;
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_describe = product_describe;
        this.quantity = quantity;
        this.qutbound_order_id = qutbound_order_id;
        this.review_time = review_time;
        this.checked_audit = checked_audit;
    }
}
