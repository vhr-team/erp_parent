package cn.ddossec.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 产品的设计中的工序单
 */
@Getter
@Setter
@ToString
public class Product_designprocess{

    /**
     * 主键
     */
    private Integer id;

    /**
     * 工序名称
     */
    private String process_name;
    /**
     * 工序编号
     */
    private String process_id;

    /**
     * 工序描述
     */
    private String process_describe;
    /**
     * 工时数
     */
    private Integer process_time_gs;

    /**
     * 单位
     */
    private String process_time_unitdw;
    /*
    小计
     */
    private float process_subtotal;
    /**
     * 产品编号  外键
     */
    private String design_id;
    /**
     * 工时成本
     */
    private float process_time_cost;

    public Product_designprocess(Integer id, String process_name, String process_id, String process_describe, Integer process_time_gs, String process_time_unitdw, float process_subtotal, String design_id, float process_time_cost) {
        this.id = id;
        this.process_name = process_name;
        this.process_id = process_id;
        this.process_describe = process_describe;
        this.process_time_gs = process_time_gs;
        this.process_time_unitdw = process_time_unitdw;
        this.process_subtotal = process_subtotal;
        this.design_id = design_id;
        this.process_time_cost = process_time_cost;
    }
}
