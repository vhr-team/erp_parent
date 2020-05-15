package cn.ddossec.service;

import cn.ddossec.common.DataGridView;
import cn.ddossec.domain.WarehouseStock;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * (WarehouseStock)表服务接口
 *
 * @author 谷辉
 * @since 2020-04-19 15:05:40
 */
public interface WarehouseStockService {


    /**
     * 通过产品编号获取安全库存的当前存储量和最大存储量，求出剩余存储量
     *
     * @param product_id 库存编号
     * @param page
     * @param limit
     * @return
     */
    DataGridView queryInventory(String product_id,Integer page,Integer limit);

    /**
     * 新增数据
     *
     * @param warehouseStock 实例对象
     * @return 实例对象
     */
    int insertSecuritySheet(WarehouseStock warehouseStock);

    /**
     *查询安全库存配置
     *
     * @param checkTag 复核标志
     * @return 安全库存数据
     */
    DataGridView querySecuritySheet(String checkTag, String productName, int page, int limit);

    /**
     * 复核成功
     *
     * @param check_tag 复核标志
     * @param check_time 复核时间
     * @param product_id 产品编号
     * @return 影响行数
     */
    int updateSecuritySheet(String check_tag, Date check_time, String product_id, String checker);

    /**
     * 通过序号修改安全库存配置
     * @param minAmount 库存报警下限
     * @param maxAmount 库存报警上限
     * @param maxCapacityAmount 最大存储量
     * @param Id 序号
     */
    void updateAmount(Integer minAmount,Integer maxAmount,Integer maxCapacityAmount,Integer Id);


    /**
     * 通过产品编号删除数据
     *
     * @param id 序号
     */
    int deleteByProductId(Integer id);

}