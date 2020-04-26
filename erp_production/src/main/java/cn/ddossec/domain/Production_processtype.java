package cn.ddossec.domain;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Production_processtype {

    /**
     *工序编号
     */
    private Integer id;

    /**
     *工序名称
     */
    private String process_name;

    /**
     *工序描述
     */
    private String process_describe;

    /**
     *设计要求
     */
    private String design_require;


    public Production_processtype(Integer id, String process_name, String process_describe, String design_require) {
        this.id = id;
        this.process_name = process_name;
        this.process_describe = process_describe;
        this.design_require = design_require;
    }
}
