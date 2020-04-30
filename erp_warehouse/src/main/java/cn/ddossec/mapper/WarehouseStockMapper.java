package cn.ddossec.mapper;

import cn.ddossec.domain.WarehouseStock;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * (WarehouseStock)表数据库访问层
 *
 * @author 谷辉
 * @since 2020-04-19 15:05:40
 */
public interface WarehouseStockMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WarehouseStock queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param stockId 根据库存编号模糊查询
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<WarehouseStock> queryAllByLimit(@Param("stockId") String stockId, @Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param warehouseStock 实例对象
     * @return 对象列表
     */
    List<WarehouseStock> queryAll(WarehouseStock warehouseStock);

    /**
     * 新增安全库存配置单
     *
     * @param warehouseStock 实例对象
     * @return 影响行数
     */
    int insertSecuritySheet(WarehouseStock warehouseStock);

    /**
     *查询安全库存配置
     *
     * @param check_tag 复核标志
     * @return 安全库存数据
     */
    List<WarehouseStock> querySecuritySheet(String check_tag);

    /**
     * 复核成功
     *
     * @param check_tag 复核标志
     * @param check_time 复核时间
     * @param checker 复核人
     * @param product_id 产品编号
     * @return 影响行数
     */
    int updateSecuritySheet(@Param("check_tag") String check_tag, @Param("check_time") Date check_time, @Param("checker") String checker, @Param("product_id") String product_id);

    /**
     * 通过库存编号修改安全库存配置
     * @param minAmount 库存报警下限
     * @param maxAmount 库存报警上限
     * @param maxCapacityAmount 最大存储量
     * @param stockId 库存编号
     */
    void updateAmount(@Param("minAmount") Integer minAmount,@Param("maxAmount") Integer maxAmount,@Param("maxCapacityAmount") Integer maxCapacityAmount,@Param("stockId") String stockId);

    /**
     * 通过产品编号删除数据
     *
     * @param productId 产品编号
     */
    int deleteByProductId(String productId);

}