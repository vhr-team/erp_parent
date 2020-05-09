package cn.ddossec.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 工序物料设计单表
 */
@Getter
@Setter
@ToString
public class Process_design {

    /*
        ID
         */
    private Integer  id;


    /**
     * 设计单编号
     */
    private String process_design_number;


    /**
     * 产品名称
     */
    private  String product_name;

    /**
     * 产品编号
     */
    private String product_number;


    /**
     * 设计人
     */
    private String designer;
    /**
     * 设计时间
     */
    private String registration;
    /***
     * 是否制定物料  D001未 D002已
     */
    private String design_wl;
    /**
     * 审核人
     */
    private String auditor_name;

    public Process_design(Integer id, String process_design_number, String product_name, String product_number, String designer, String registration, String design_wl, String auditor_name) {
        this.id = id;
        this.process_design_number = process_design_number;
        this.product_name = product_name;
        this.product_number = product_number;
        this.designer = designer;
        this.registration = registration;
        this.design_wl = design_wl;
        this.auditor_name = auditor_name;
    }
}
