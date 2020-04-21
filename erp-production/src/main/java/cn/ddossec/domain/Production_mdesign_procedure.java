package cn.ddossec.domain;


import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Data
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
    private String gprocedure_id;

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
}
