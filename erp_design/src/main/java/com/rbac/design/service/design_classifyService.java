package com.rbac.design.service;

import com.rbac.design.pojo.design_classify;

import java.util.List;

/** 产品设计分类
 * @author joker_dj
 * @create 2020-04-18日 11:45
 */
public interface design_classifyService {
    /**
     * 查询全部分类
     * @return
     */
    List<design_classify> queryAll();

    /**
     * 新增分类选项
     * @param classify
     */
    void adddesign_classify(design_classify classify);
    /**
     * 根据主键删除
     * 删除分类选项
     * @param classify
     */
     void deleteclassifyById(design_classify classify);
}
