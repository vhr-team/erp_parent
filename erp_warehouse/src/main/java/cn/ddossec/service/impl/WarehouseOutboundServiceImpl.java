package cn.ddossec.service.impl;

import cn.ddossec.domain.WarehouseOutbound;
import cn.ddossec.mapper.WarehouseOutboundMapper;
import cn.ddossec.service.WarehouseOutboundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (WarehouseOutbound)表服务实现类
 *
 * @author 谷辉
 * @since 2020-04-22 14:34:41
 */
@SuppressWarnings("all")
@Service("warehouseOutboundServiceImpl")
public class WarehouseOutboundServiceImpl implements WarehouseOutboundService {
    @Autowired
    private WarehouseOutboundMapper warehouseOutboundMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public WarehouseOutbound queryById(Integer id) {
        return this.warehouseOutboundMapper.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @Param outbound_id 根据出库单编号模糊查询
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<WarehouseOutbound> queryAllByLimit(String outbound_id, int offset, int limit) {
        return this.warehouseOutboundMapper.queryAllByLimit(outbound_id, offset, limit);
    }

    /**
     * 新增数据
     *
     * @param warehouseOutbound 实例对象
     * @return 实例对象
     */
    @Override
    public WarehouseOutbound insert(WarehouseOutbound warehouseOutbound) {
        this.warehouseOutboundMapper.insert(warehouseOutbound);
        return warehouseOutbound;
    }

    /**
     * 修改数据
     *
     * @param warehouseOutbound 实例对象
     * @return 实例对象
     */
    @Override
    public WarehouseOutbound update(WarehouseOutbound warehouseOutbound) {
        this.warehouseOutboundMapper.update(warehouseOutbound);
        return this.queryById(warehouseOutbound.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.warehouseOutboundMapper.deleteById(id) > 0;
    }
}