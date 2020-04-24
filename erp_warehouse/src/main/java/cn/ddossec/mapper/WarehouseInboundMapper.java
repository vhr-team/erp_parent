package cn.ddossec.mapper;

import cn.ddossec.domain.WarehouseInbound;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (WarehouseInbound)表数据库访问层
 *
 * @author 谷辉
 * @since 2020-04-24 17:06:41
 */
public interface WarehouseInboundMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WarehouseInbound queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<WarehouseInbound> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param warehouseInbound 实例对象
     * @return 对象列表
     */
    List<WarehouseInbound> queryAll(WarehouseInbound warehouseInbound);

    /**
     * 新增数据
     *
     * @param warehouseInbound 实例对象
     * @return 影响行数
     */
    int insert(WarehouseInbound warehouseInbound);

    /**
     * 修改数据
     *
     * @param warehouseInbound 实例对象
     * @return 影响行数
     */
    int update(WarehouseInbound warehouseInbound);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}