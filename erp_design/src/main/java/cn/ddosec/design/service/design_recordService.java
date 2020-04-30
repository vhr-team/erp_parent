package cn.ddosec.design.service;

import cn.ddosec.design.entity.PageResult;
import cn.ddosec.design.pojo.product_design_record;

/**
 * @author joker_dj
 * @create 2020-04-30日 10:23
 */
public interface design_recordService {

    /**
     * 分页查询
     *
     * @param page
     * @param pageSize
     * @param record
     * @return
     */
    PageResult findPage(Integer page, Integer pageSize, product_design_record record);

    /**
     * 根据ID查询
     *
     * @param Id
     * @return
     */
    product_design_record selectById(Integer Id);

    /**
     * 修改档案
     *
     * @param record
     */
    void updaterecord(product_design_record record);

    /**
     * 添加档案
     *
     * @param record
     */
    void addrecord(product_design_record record);

    /**
     * 回收档案
     *
     * @param record
     */
    void deleterecord(product_design_record record);

    /**
     * 分页查询已回收的档案
     *
     * @param page
     * @param pageSize
     * @param record
     * @return
     */
    PageResult findPagerecycle(Integer page, Integer pageSize, product_design_record record);

    /*档案恢复*/
    void recordrecover(product_design_record record);
}
