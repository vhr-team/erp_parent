package com.rbac.design.service;

import com.rbac.design.entity.PageResult;
import com.rbac.design.pojo.design_classify;

import java.util.List;

/** 产品设计分类
 * @author joker_dj
 * @create 2020-04-18日 11:45
 */
public interface design_classifyService {
    /**
     * 查询全部分类
     *
     * @return
     */
    List<design_classify> queryAll(design_classify classify);

    /**
     * 新增分类选项
     *
     * @param classify
     */
    void adddesign_classify(design_classify classify);

    /**
     * 根据主键删除
     * 删除分类选项
     *
     * @param classify
     */
    void deleteclassifyById(Integer id, String kindName);

    /**
     * 分页查询
     *
     * @param page
     * @param pageSize
     * @return
     */
    PageResult findPage(Integer page, Integer pageSize, design_classify classify);

    /**
     * 根据id修改分类
     *
     * @param classify
     */
    void updateclassifyById(design_classify classify);

    /**
     * 根据分类名称查询分类
     *
     * @param classify
     * @return
     */
    design_classify queryByName(design_classify classify);

    /**
     * 根据父级id删除分类
     *
     * @param pId
     */
    void deleteclassifyBypId(Integer pId);

    /**
     * 根据id查询分类菜单
     *
     * @return
     */
    List<design_classify> selectById(Integer id);


    /**
     * 根据pid查询分类菜单
     *
     * @return
     */
    List<design_classify> selectBypId(Integer pId);
}
