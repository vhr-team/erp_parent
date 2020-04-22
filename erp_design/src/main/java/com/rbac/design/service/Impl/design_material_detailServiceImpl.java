package com.rbac.design.service.Impl;

import com.rbac.design.mapper.design_material_detailmapper;
import com.rbac.design.pojo.design_material_detail;
import com.rbac.design.service.design_material_detailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author joker_dj
 * @create 2020-04-22日 12:30
 */
@Service
@Transactional
public class design_material_detailServiceImpl implements design_material_detailService {
    @Autowired
    design_material_detailmapper mapper;

    @Override
    public design_material_detail selectByproductId(String productId) {
        return mapper.selectByproductId(productId);
    }

    @Override
    public void update_detail(String proid, String productName, String type, String product_describe, String amountUnit) {
        mapper.update_detail(proid, productName, type, product_describe, amountUnit);
    }

    @Override
    public void add_detail(design_material_detail detail) {
        mapper.insertSelective(detail);
    }

    @Override
    public void delete_detail(String proid) {
        mapper.delete_detail(proid);
    }

    @Override
    public List<design_material_detail> selectAll() {

        return mapper.selectByExample(null);
    }


}
