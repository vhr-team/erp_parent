package com.rbac.design.service.Impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.rbac.design.entity.PageResult;
import com.rbac.design.mapper.design_recordmapper;
import com.rbac.design.pojo.design_record;
import com.rbac.design.pojo.design_recordQuery;
import com.rbac.design.service.design_record_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author joker_dj
 * @create 2020-04-17日 10:34
 */
@Service
@Transactional
public class design_record_ServiceImpl implements design_record_Service {

    @Autowired
    design_recordmapper mapper;

    /**
     * 查询全部档案
     *
     * @return List<design_record>
     */
    @Override
    public List<design_record> queryAll() {
        return mapper.selectByExample(null);
    }

    /**
     * 分页查询
     *
     * @param page     页码
     * @param pageSize 显示的行数1
     * @param record   传入的档案
     * @return
     */
    @Override
    public PageResult findPage(Integer page, Integer pageSize, design_record record) {
        //利用分页助手实现分页, 第一个参数:当前页, 第二个参数: 每页展示数据条数
        PageHelper.startPage(page, pageSize);
        design_recordQuery Query = new design_recordQuery();
        design_recordQuery.Criteria criteria = Query.createCriteria();
        if (record != null) {
            if (record.getProductName() != null) {//商品名称
                criteria.andProductNameLike("%" + record.getProductName() + "%");
            }
            if (record.getRegisterTime() != null) {//建档时间

                criteria.andRegisterTimeLike("%" + record.getRegisterTime() + "%");
            }
        }
        Page<design_record> design_records = (Page<design_record>) mapper.selectByExample(Query);
        PageResult result = new PageResult(design_records.getTotal(), design_records.getResult());
        return result;
    }

    /**
     * 添加产品档案
     *
     * @param record
     */
    @Override
    public void addrecord(design_record record) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        record.setRegisterTime(df.format(new Date()));
        record.setPriceChangeTag("未变更");
        record.setDeleteTag("已上架");
        record.setFileChangeAmount(0);
        mapper.insertSelective(record);
    }

    /**
     * 根据主键修改档案
     *
     * @param record
     */
    @Override
    public void updaterecordById(design_record record) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        record.setChangeTime(df.format(new Date()));//变更时间
        record.setChangeTag("已变更");//
        record.setFileChangeAmount(record.getFileChangeAmount() + 1);//修改档案就登记添加一次修改次数
        mapper.updateByPrimaryKeySelective(record);
    }


    /**
     * 商品上下架
     *
     * @param record
     */
    @Override
    public void putawayrecord(design_record record) {
        mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public design_record selectById(design_record record) {
        return mapper.selectByPrimaryKey(record.getId());
    }

    @Override
    public void deletebatch(Integer[] idx) {

        design_recordQuery Query = new design_recordQuery();//创建brandQuery对象
        design_recordQuery.Criteria criteria = Query.createCriteria();//createCriteria： 创建追加条件
        criteria.andIdIn(Arrays.asList(idx));//根据id集合删除品牌
        mapper.deleteByExample(Query);
    }

}
