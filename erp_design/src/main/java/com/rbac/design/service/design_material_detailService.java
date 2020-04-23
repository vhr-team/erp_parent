package com.rbac.design.service;

import com.rbac.design.pojo.design_material_detail;

import java.util.List;

/**
 * @author joker_dj
 * @create 2020-04-22日 12:30
 */
public interface design_material_detailService {
    /**
     * 根据物料id查询
     *
     * @param productId
     * @return
     */
    design_material_detail selectByproductId(String productId);


    /**
     * 修改
     *
     * @param proid
     * @param productName
     * @param type
     * @param product_describe
     * @param amountUnit
     */
    void update_detail(String proid, String productName, String type, String product_describe, String amountUnit);

    /**
     * 添加
     *
     * @param detail
     */
    void add_detail(design_material_detail detail);

    /**
     * 根据物料id删除
     *
     * @param proid
     */
    void delete_detail(String proid);

    /**
     * 查询所有
     *
     * @return
     */
    List<design_material_detail> selectAll();
}
