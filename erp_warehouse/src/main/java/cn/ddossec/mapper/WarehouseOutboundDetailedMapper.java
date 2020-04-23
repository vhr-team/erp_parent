package cn.ddossec.mapper;

import cn.ddossec.domain.WarehouseOutboundDetailed;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (WarehouseOutboundDetailed)表数据库访问层
 *
 * @author 谷辉
 * @since 2020-04-22 15:33:29
 */
public interface WarehouseOutboundDetailedMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WarehouseOutboundDetailed queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<WarehouseOutboundDetailed> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param warehouseOutboundDetailed 实例对象
     * @return 对象列表
     */
    List<WarehouseOutboundDetailed> queryAll(WarehouseOutboundDetailed warehouseOutboundDetailed);

    /**
     * 新增数据
     *
     * @param warehouseOutboundDetailed 实例对象
     * @return 影响行数
     */
    int insert(WarehouseOutboundDetailed warehouseOutboundDetailed);

    /**
     * 修改数据
     *
     * @param warehouseOutboundDetailed 实例对象
     * @return 影响行数
     */
    int update(WarehouseOutboundDetailed warehouseOutboundDetailed);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}