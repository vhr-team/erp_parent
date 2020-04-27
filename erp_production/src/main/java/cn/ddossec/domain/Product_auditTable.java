package cn.ddossec.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * 产品审核单
 */
@Getter
@Setter
@ToString
public class Product_auditTable   implements Serializable {
    /*
    ID
     */
    private Integer  id;
    /**
     * 设计单编号  外键
     * Production_mdesign_procedure
     * design_id
     */
    private Production_process_design_sheet design_id;

    private Integer  design_idA;
    /**
     * 设计单状态
     */
    private String sjdState;
    /**
     * 审核状态
     */
    private String shState;
    /**
     * 总计
     */
    private  float manhourcost;

    public Product_auditTable(Integer id, Integer design_idA, String sjdState, String shState, float manhourcost) {
        this.id = id;
        this.design_idA = design_idA;
        this.sjdState = sjdState;
        this.shState = shState;
        this.manhourcost = manhourcost;
    }
}
