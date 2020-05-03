package cn.ddossec.service.impl;

import cn.ddossec.common.DataGridView;
import cn.ddossec.domain.WarehouseStock;
import cn.ddossec.mapper.WarehouseStockMapper;
import cn.ddossec.service.WarehouseStockService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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
        return this.warehouseStockMapper.insert(warehouseStock);
    }

    /**
     *查询安全库存配置
     *
     * @param check_tag 复核标志
     * @return 安全库存数据
     */
    public DataGridView querySecuritySheet(String check_tag,int page,int limit){
        QueryWrapper<WarehouseStock> queryWrapper = new QueryWrapper<>();
        //product_name,product_id,min_amount,max_amount,register,register_time,config,max_capacity_amount
        queryWrapper.eq("check_tag",check_tag).select("id","product_name","product_id","min_amount","max_amount","register","register_time","config","max_capacity_amount");
        Page<WarehouseStock> pages = new Page<>(page,limit);
        IPage<WarehouseStock> iPage = this.warehouseStockMapper.selectPage(pages,queryWrapper);
        //iPage.getTotal() 总共多少页   iPage.getRecords()查询出来的所有数据
        return new DataGridView(iPage.getTotal(),iPage.getRecords());
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
     * 通过序号修改安全库存配置
     * @param minAmount 库存报警下限
     * @param maxAmount 库存报警上限
     * @param maxCapacityAmount 最大存储量
     * @param Id 序号
     */
    @Override
    public void updateAmount(Integer minAmount,Integer maxAmount,Integer maxCapacityAmount,Integer Id){
        this.warehouseStockMapper.updateAmount(minAmount, maxAmount, maxCapacityAmount, Id);
    }

    /**
     * 通过序号删除数据
     *
     * @param id 序号
     */
    @Override
    public int deleteByProductId(Integer id){
        return warehouseStockMapper.deleteByProductId(id);
    }
}