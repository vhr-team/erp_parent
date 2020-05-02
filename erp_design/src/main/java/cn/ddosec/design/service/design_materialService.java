package cn.ddosec.design.service;

import cn.ddosec.design.entity.PageResult;
import cn.ddosec.design.pojo.product_design_material;

/**
 * 物料档案
 *
 * @author joker_dj
 * @create 2020-05-01日 14:42
 */
public interface design_materialService {
    /**
     * 分页查询物料
     *
     * @param page
     * @param pageSize
     * @param material
     * @return
     */
    PageResult findpage(Integer page, Integer pageSize, product_design_material material);

    void addmaterial(product_design_material material);

    void updatematerial(product_design_material material);
}
