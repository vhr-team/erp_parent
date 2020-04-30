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
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WarehouseStock queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param stockId 根据库存编号模糊查询
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<WarehouseStock> queryAllByLimit(String stockId, int offset, int limit);

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
     * @param check_tag 复核标志
     * @return 安全库存数据
     */
    DataGridView querySecuritySheet(String check_tag, int page, int limit);

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