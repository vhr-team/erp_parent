package cn.ddossec.service.impl;

import cn.ddossec.common.DataGridView;
import cn.ddossec.domain.WarehouseStock;
import cn.ddossec.mapper.WarehouseStockMapper;
import cn.ddossec.service.WarehouseStockService;
import cn.ddossec.service.designRecordFeignService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

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

    @Autowired
    private designRecordFeignService designRecordFeignService;


    /**
     * 根据产品编号查询出序号
     * @param product_id 产品编号
     * @return
     */
    @Override
    public void queryId(String product_id,Integer gathered_amount) {
        QueryWrapper<WarehouseStock> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("product_id",product_id).select("id","amount");//查询出序号和当前存储量
        WarehouseStock warehouseStock = warehouseStockMapper.selectOne(queryWrapper);
        warehouseStock.setAmount(warehouseStock.getAmount()+gathered_amount);
        warehouseStockMapper.updateById(warehouseStock);
    }

    /**
     * 通过产品编号获取安全库存的当前存储量和最大存储量，求出剩余存储量
     *
     * @param product_id 库存编号
     * @param page
     * @param limit
     * @return
     */
    @Override
    public DataGridView queryInventory(String product_id) {
        QueryWrapper<WarehouseStock> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("max_capacity_amount","amount").eq("product_id",product_id);
        return new DataGridView(warehouseStockMapper.selectOne(queryWrapper));
    }

    /**
     * 新增安全库存配置单
     *
     * @param warehouseStock 实例对象
     * @return 实例对象
     */
    @Transactional
    @Override
    public int insertSecuritySheet(WarehouseStock warehouseStock) {
        try {
            this.warehouseStockMapper.insert(warehouseStock);
            Integer InventoryStatus = 1;
            String ProductId = warehouseStock.getProductId();
            designRecordFeignService.updateinventoryStatus(ProductId,InventoryStatus);
        }catch (Exception e){
            e.printStackTrace();
        }
        return 1;
    }

    /**
     *查询安全库存配置
     *
     * @param check_tag 复核标志
     * @return 安全库存数据
     */
    public DataGridView querySecuritySheet(String checkTag,String productName,int page,int limit){
        QueryWrapper<WarehouseStock> queryWrapper = new QueryWrapper<>();
        //product_name,product_id,min_amount,max_amount,register,register_time,config,max_capacity_amount
        queryWrapper.select("id","product_name","stock_id","product_id","min_amount","max_amount","register","register_time","config","max_capacity_amount").eq("check_tag",checkTag).like("product_name",productName).orderByDesc("id");
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
        QueryWrapper<WarehouseStock> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(product_id != null,"product_id",product_id).select("id");
        WarehouseStock warehouseStock = warehouseStockMapper.selectOne(queryWrapper);
        warehouseStock.setCheckTag(check_tag);
        warehouseStock.setCheckTime(check_time);
        warehouseStock.setChecker(checker);
        return warehouseStockMapper.updateById(warehouseStock);
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