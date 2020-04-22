package com.rbac.design.service;

import com.rbac.design.entity.PageResult;
import com.rbac.design.pojo.design_material;

import java.util.List;

/**
 * @author joker_dj
 * @create 2020-04-22日 11:01
 */
public interface design_materialService {
    PageResult findpage(Integer page, Integer pageSize, design_material material);

    void updatedesign_material(design_material material);

    void adddesign_material(design_material material);

    void delete_design_material(String proid);

    List<design_material> selectAll();

}
