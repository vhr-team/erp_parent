package com.rbac.design.service;

import com.rbac.design.pojo.design_material_detail;

/**
 * @author joker_dj
 * @create 2020-04-22日 12:30
 */
public interface design_material_detailService {
    design_material_detail selectByproductId(String productId);
}
