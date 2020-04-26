package cn.ddossec.domain;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class Production_process_design_sheet {

    /*
     * 序
     */
    private Integer id;

    /*
     * 产品名称
     */
    private String product_name;

    /*
     * 产品编号
     */
    private String design_id;

    /*
     * 设计人
     */
    private String product_designer;

    /**
     * 登记人
     */
    private String product_registrant;

    /*
     * 设计要求
     */
    private String esign_require;

    /*
     * 设计时间
     */
    private Date design_date;

    /**
     * 设计单号
     */
    private  String design_number;

    public Production_process_design_sheet(Integer id, String product_name, String design_id, String product_designer, String product_registrant, String esign_require, Date design_date, String design_number) {
        this.id = id;
        this.product_name = product_name;
        this.design_id = design_id;
        this.product_designer = product_designer;
        this.product_registrant = product_registrant;
        this.esign_require = esign_require;
        this.design_date = design_date;
        this.design_number = design_number;
    }
}
