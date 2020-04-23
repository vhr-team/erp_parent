package cn.ddossec.service.impl;

import cn.ddossec.domain.WarehouseStock;
import cn.ddossec.mapper.WarehouseStockMapper;
import cn.ddossec.service.WarehouseStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * (WarehouseStock)表服务实现类
 *
 * @author 谷辉
 * @since 2020-04-19 15:05:40
 */
@SuppressWarnings("all")
@Service("warehouseStockServiceImpl")
public class WarehouseStockServiceImpl implements WarehouseStockService {
    @Autowired
    private WarehouseStockMapper warehouseStockMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public WarehouseStock queryById(Integer id) {
        return this.warehouseStockMapper.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param stockId 根据库存编号模糊查询
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<WarehouseStock> queryAllByLimit(String stockId, int offset, int limit) {
        return this.warehouseStockMapper.queryAllByLimit(stockId, offset, limit);
    }

    /**
     * 新增安全库存配置单
     *
     * @param warehouseStock 实例对象
     * @return 实例对象
     */
    @Override
    public int insertSecuritySheet(WarehouseStock warehouseStock) {
        return this.warehouseStockMapper.insertSecuritySheet(warehouseStock);
    }

    /**
     *查询安全库存配置
     *
     * @param check_tag 复核标志
     * @return 安全库存数据
     */
    public List<WarehouseStock> querySecuritySheet(String check_tag){
        return this.warehouseStockMapper.querySecuritySheet(check_tag);
    }

    /**
     * 复核成功
     *
     * @param check_tag 复核标志
     * @param check_time 复核时间
     * @param product_id 产品编号
     * @return 影响行数
     */
    public int updateSecuritySheet(String check_tag, Date check_time, String product_id, String checker){
        return this.warehouseStockMapper.updateSecuritySheet(check_tag,check_time,product_id,checker);
    }

    /**
     * 修改数据
     *
     * @param warehouseStock 实例对象
     * @return 实例对象
     */
    @Override
    public int update(WarehouseStock warehouseStock) {
        this.warehouseStockMapper.update(warehouseStock);
        return this.warehouseStockMapper.update(warehouseStock);
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.warehouseStockMapper.deleteById(id) > 0;
    }
}