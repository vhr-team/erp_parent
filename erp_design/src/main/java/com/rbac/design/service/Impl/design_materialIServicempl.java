package com.rbac.design.service.Impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.rbac.design.entity.PageResult;
import com.rbac.design.mapper.design_materialmapper;
import com.rbac.design.pojo.design_material;
import com.rbac.design.pojo.design_materialQuery;
import com.rbac.design.service.design_materialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author joker_dj
 * @create 2020-04-22日 11:03
 */
@Service
@Transactional
public class design_materialIServicempl implements design_materialService {
    @Autowired
    design_materialmapper mapper;

    @Override
    public PageResult findpage(Integer page, Integer pageSize, design_material material) {
        PageHelper.startPage(page, pageSize);
        design_materialQuery query = new design_materialQuery();
        if (material != null) {
            design_materialQuery.Criteria criteria = query.createCriteria();
            if (material.getProductName() != null && material.getProductName() != "") {
                criteria.andProductNameLike("%" + material.getProductName() + "%");
            }
        }
        Page<design_material> design_materials = (Page<design_material>) mapper.selectByExample(query);
        return new PageResult(design_materials.getTotal(), design_materials.getResult());
    }

    @Override
    public void updatedesign_material(design_material material) {
        mapper.updateByPrimaryKeySelective(material);
    }

    @Override
    public void adddesign_material(design_material material) {
        mapper.insertSelective(material);
    }

    @Override
    public void delete_design_material(String proid) {
        mapper.deleteByProId(proid);
    }

    @Override
    public List<design_material> selectAll() {
        design_materialQuery query = new design_materialQuery();
        design_materialQuery.Criteria criteria = query.createCriteria();
        criteria.andCheckTagEqualTo("审核通过");
        return mapper.selectByExample(query);
    }
}
