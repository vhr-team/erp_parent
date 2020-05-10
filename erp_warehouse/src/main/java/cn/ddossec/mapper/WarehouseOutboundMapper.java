package cn.ddossec.mapper;

import cn.ddossec.domain.WarehouseOutbound;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (WarehouseOutbound)表数据库访问层
 *
 * @author 谷辉
 * @since 2020-04-22 14:34:41
 */
public interface WarehouseOutboundMapper extends BaseMapper<WarehouseOutbound> {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WarehouseOutbound queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @Param outbound_id 根据出库单编号模糊查询
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<WarehouseOutbound> queryAllByLimit(@Param("outbound_id") String outbound_id, @Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param warehouseOutbound 实例对象
     * @return 对象列表
     */
    List<WarehouseOutbound> queryAll(WarehouseOutbound warehouseOutbound);

    /**
     * 新增数据
     *
     * @param warehouseOutbound 实例对象
     * @return 影响行数
     */
    int insert(WarehouseOutbound warehouseOutbound);

    /**
     * 修改数据
     *
     * @param warehouseOutbound 实例对象
     * @return 影响行数
     */
    int update(WarehouseOutbound warehouseOutbound);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}