package cn.ddossec.service.impl;

import cn.ddossec.common.DataGridView;
import cn.ddossec.domain.WarehouseInbound;
import cn.ddossec.mapper.WarehouseInboundMapper;
import cn.ddossec.service.WarehouseInboundService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * (WarehouseInbound)表服务实现类
 *
 * @author 谷辉
 * @since 2020-04-24 17:06:40
 */
@SuppressWarnings("all")
@Service("warehouseInboundServiceImpl")
public class WarehouseInboundServiceImpl implements WarehouseInboundService {
    @Autowired
    private WarehouseInboundMapper warehouseInboundMapper;


    /**
     * 查询所有审核通过 可入库的数据
     *
     * @param check_tag
     * @return
     */
    @Override
    public DataGridView queryAllInbound(Integer check_tag, Integer page, Integer limit) {
        return null;
    }

    @Override
    public DataGridView queryInbound(String storeTag, int page, int limit) {
        QueryWrapper<WarehouseInbound> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("store_tag",storeTag).select("","","","","","");
        return null;
    }

    /**
     * 查询可调度入库数据
     *
     * @param checkTag 入库审核状态
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public DataGridView queryInboundLimit(String checkTag, int page, int limit){
        QueryWrapper<WarehouseInbound> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("check_tag",checkTag).select("id","inbound_id","reason","register_time","amount_sum","cost_price_sum");
        Page<WarehouseInbound> pages = new Page<>(page,limit);
        IPage iPage = warehouseInboundMapper.selectPage(pages,queryWrapper);
        return new DataGridView(iPage.getTotal(),iPage.getRecords());
    }

    /**
     * 入库申请登记
     *
     * @param warehouseInbound 实例对象
     * @return 实例对象
     */
    @Transactional
    @Override
    public int insertWarehousing(WarehouseInbound warehouseInbound) {
        return this.warehouseInboundMapper.insertWarehousing(warehouseInbound);
    }

    /**
     * 入库申请审核
     *
     * @param check_tag 入库标志 0待审核 1复核不通过 2复核通过
     * @param check_time 复核时间
     * @param checker 复核人
     * @param inbound_id 入库单编号 (随机生成)
     * @return
     */
    @Override
    public int updateWarehousing(String check_tag, Date check_time, String checker, String inbound_id) {
        return this.warehouseInboundMapper.updateWarehousing(check_tag,check_time,checker,inbound_id);
    }

}