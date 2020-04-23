package com.rbac.design.service;

import com.rbac.design.entity.PageResult;
import com.rbac.design.entity.miutichecker;
import com.rbac.design.pojo.design_material;

import java.util.List;

/**
 * 物料
 *
 * @author joker_dj
 * @create 2020-04-22日 11:01
 */
public interface design_materialService {
    /**
     * 分页查询
     *
     * @param page
     * @param pageSize
     * @param material
     * @return
     */
    PageResult findpage(Integer page, Integer pageSize, design_material material);

    /**
     * 根据主键修改
     *
     * @param material
     */
    void updatedesign_material(design_material material);

    /**
     * 添加
     *
     * @param material
     */
    void adddesign_material(design_material material);

    /**
     * 根据物料id删除
     *
     * @param proid
     */
    void delete_design_material(String proid);

    /**
     * 查询所有
     *
     * @return
     */
    List<design_material> selectAll();


    /**
     * 分页查询
     *
     * @param page
     * @param pageSize
     * @param material
     * @return
     */
    PageResult design_materialcheck(Integer page, Integer pageSize, design_material material);

    void check(design_material material);

    void miuticheck(miutichecker checker);
}
