package cn.ddossec.domain;



import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
public class Production_mdesign_procedure implements Serializable {
    /**
     * 主键
     */
    private Integer id;


    /**
     * 设计编号
     */
    private String design_id;

    /**
     * 产品I级分类编号
     */
    private String first_kind_id;

    /**
     * 产品I级分类名称
     */
    private String first_kind_name;

    /**
     * 工序编号
     */
    private String procedure_id;

    /**
     * 工序名称
     */
    private String procedure_name;

    /**
     * 工时数
     */
    private Integer labour_hour_amount;

    /**
     * 工序描述
     */
    private String procedurce_describe;

    /**
     * 单位
     */
    private String amount_unit;

    /**
     * 单位工时成本
     */
    private Integer cost_price;

    /**
     * 工时成本小计
     */
    private Double subtotal;

    /**
     * 物料成本小计
     */
    private Double module_subtotal;

    /**
     * 登记人
     */
    private String register;

    /**
     * 登记时间
     */
    private Date register_time;

    /**
     * 当前工序物料标志D002-0: 未设计 D002-1: 已设计
     */
    private String design_module_tag;

    /**
     * 当前工序物料变更标志 D003-0: 未变更D003-0: 已变更
     */
    private String design_module_change_tag;

    /**
     * 产品名称
     */
    private String product_name;
    /**
     * 一级
     */
    private String product_stair_classify;


    /**
     * 二级
     */
    private String product_second_classify;

    /**
     * 三级
     *
     */
    private String product_tertiary_classify;
    /**
     * 设计人
     */
    private String product_designer;



    public Production_mdesign_procedure(Integer id, String design_id, String first_kind_id, String first_kind_name, String procedure_id, String procedure_name, Integer labour_hour_amount, String procedurce_describe, String amount_unit, Integer cost_price, Double subtotal, Double module_subtotal, String register, Date register_time, String design_module_tag, String design_module_change_tag, String product_name, String product_stair_classify, String product_second_classify, String product_tertiary_classify, String product_designer) {
        this.id = id;
        this.design_id = design_id;
        this.first_kind_id = first_kind_id;
        this.first_kind_name = first_kind_name;
        this.procedure_id = procedure_id;
        this.procedure_name = procedure_name;
        this.labour_hour_amount = labour_hour_amount;
        this.procedurce_describe = procedurce_describe;
        this.amount_unit = amount_unit;
        this.cost_price = cost_price;
        this.subtotal = subtotal;
        this.module_subtotal = module_subtotal;
        this.register = register;
        this.register_time = register_time;
        this.design_module_tag = design_module_tag;
        this.design_module_change_tag = design_module_change_tag;
        this.product_name = product_name;
        this.product_stair_classify = product_stair_classify;
        this.product_second_classify = product_second_classify;
        this.product_tertiary_classify = product_tertiary_classify;
        this.product_designer = product_designer;
    }

    public Production_mdesign_procedure(Integer id, String design_module_tag) {
        this.id = id;

        this.design_module_tag = design_module_tag;

    }

}
