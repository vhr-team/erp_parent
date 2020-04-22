package com.rbac.design.service;

import com.rbac.design.pojo.design_material_detail;

import java.util.List;

/**
 * @author joker_dj
 * @create 2020-04-22日 12:30
 */
public interface design_material_detailService {
    design_material_detail selectByproductId(String productId);

    /*
    * detail.setProductId(proid);
            detail.setType(type);
            detail.setProductDescribe(product_describe);
            detail.setAmountUnit(amountUnit);*/
    void update_detail(String proid, String productName, String type, String product_describe, String amountUnit);

    void add_detail(design_material_detail detail);

    void delete_detail(String proid);

    List<design_material_detail> selectAll();
}
