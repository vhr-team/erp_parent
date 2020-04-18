package com.rbac.design.service.Impl;

import com.rbac.design.mapper.design_classifymapper;
import com.rbac.design.pojo.design_classify;
import com.rbac.design.pojo.design_classifyQuery;
import com.rbac.design.service.design_classifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author joker_dj
 * @create 2020-04-18日 11:47
 */
@Service
@Transactional
public class design_classifyServiceImpl implements design_classifyService {

    @Autowired
    private design_classifymapper mapper;

    /**
     * 查询全部产品分类
     *
     * @return
     */
    @Override
    public List<design_classify> queryAll() {
        return mapper.selectByExample(null);
    }

    /**
     * 新增分类选项
     *
     * @param classify
     */
    @Override
    public void adddesign_classify(design_classify classify) {
        mapper.insertSelective(classify);
    }

    /**
     * 删除分類選項的方法
     * @param classify
     */
    @Override
    public void deleteclassifyById(design_classify classify) {
        mapper.deleteByPrimaryKey(classify.getId());
        design_classifyQuery design_classifyQuery = new design_classifyQuery();
        com.rbac.design.pojo.design_classifyQuery.Criteria criteria = design_classifyQuery.createCriteria();
        if (classify.getpId() == 0) {//如果删除的父级分类 相应的子级分类也会删除
            criteria.andIdEqualTo(classify.getId());
            mapper.deleteByExample(design_classifyQuery);
        }
    }
}
