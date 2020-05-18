package cn.ddosec.design.service;

import cn.ddosec.design.entity.PageResult;
import cn.ddosec.design.pojo.product_design_record;

import java.util.List;

/**
 * @author joker_dj
 * @create 2020-04-30日 10:23
 */
public interface design_recordService {

    List<product_design_record> selectcheckAll();
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

    /*查询已回收的数量*/
    int recovernum();

    /*审核查询*/
    PageResult findPagecheck(Integer page, Integer pageSize, product_design_record record);

    /*查询未物料组成的档案*/
    PageResult notconstitute(Integer page, Integer pageSize, product_design_record record);

    void updateByproID(product_design_record record);

    /*档案审核*/
    void updatechecker(product_design_record record);

    /**修改库存编号*/
    void updateinventoryStatus(String productId,Integer InventoryStatus);

    /*查询为工序设计的档案*/
    List<product_design_record> selectprocess(product_design_record record);
    /*工序设计完成*/
    void updateprocess(product_design_record record);
}
