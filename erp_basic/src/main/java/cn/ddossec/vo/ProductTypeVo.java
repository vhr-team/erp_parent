package cn.ddossec.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author 30315
 * @title: ProductTypeVo
 * @projectName erp_parent
 * @description: TODO
 * @date 2020-04-2311:45
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class ProductTypeVo extends BaseVo {

    // 供应商ID
    private Integer supperId;
    // 分类名称
    private String name;

}
