package com.rbac.design.service.Impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.rbac.design.entity.PageResult;
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
    public List<design_classify> queryAll(design_classify classify) {
        design_classifyQuery query = new design_classifyQuery();
        if (classify != null) {
            design_classifyQuery.Criteria criteria = query.createCriteria();
            if (classify.getpId() != null) {
                criteria.andPIdEqualTo(classify.getpId());
            }
        }
        return mapper.selectByExample(query);
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

    @Override
    public PageResult findPage(Integer page, Integer pageSize, design_classify classify) {
        PageHelper.startPage(page, pageSize);
        design_classifyQuery query = new design_classifyQuery();
        if (classify != null) {
            design_classifyQuery.Criteria criteria = query.createCriteria();
            if (classify.getKindName() != null) {
                criteria.andKindNameLike("%" + classify.getKindName() + "%");
            }
        }
        Page<design_classify> design_classifies = (Page<design_classify>) mapper.selectByExample(query);
        return new PageResult(design_classifies.getTotal(), design_classifies.getResult());
    }

    @Override
    public void updateclassifyById(design_classify classify) {


        mapper.updateByPrimaryKeySelective(classify);
    }

    @Override
    public design_classify queryByName(design_classify classify) {
        return mapper.selectId(classify.getKindName());
    }
}
