package com.rbac.design.service;

import com.rbac.design.entity.PageResult;
import com.rbac.design.pojo.design_record;

import java.util.List;

/**
 * @author joker_dj
 * @create 2020-04-17日 10:33
 */
public interface design_record_Service {
    /**
     * 查询全部产品设计档案
     * @return
     */
    List<design_record> queryAll();

    /**
     * 分页条件查询
     * @param page 页码
     * @param pageSize 行数
     * @param record 传入的值
     * @return 总记录数 数据
     */
    public PageResult findPage(Integer page, Integer pageSize,design_record record );

    /**
     * 添加产品档案
     * @param record
     */
    public void addrecord(design_record record);

    /**
     * 根据主键修改产品档案
     * @param record
     */
    public void updaterecordById(design_record record);

    /**
     * @param record
     */
    void soldOutrecord(design_record record);

    /**
     *
     */
    void putawayrecord(design_record record);

    /**
     * 根据主键查询
     */
    design_record selectById(design_record record);

    void deletebatch(Long[] id);
}
