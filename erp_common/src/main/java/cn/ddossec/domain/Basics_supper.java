package cn.ddossec.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/*
 * 供货商实体类
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Basics_supper implements Serializable {

    /*
     * 序
     */
    private Integer id;

    /*
     * 联系地址
     */
    private String address;

    /*
     * 联系人
     */
    private String contact;

    /*
     * 供应商名称
     */
    private String name;

    /*
     * 联系电话
     */
    private String number;

    /*
     * 备注
     */
    private String remarks;

    /**
     * 送货状态  1 送货  2 自提
     */
    private Integer ndeeds;
}
