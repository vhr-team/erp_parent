package cn.ddossec.service.impl;

import cn.ddossec.domain.WarehouseInbound;
import cn.ddossec.mapper.WarehouseInboundMapper;
import cn.ddossec.service.WarehouseInboundService;
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
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public WarehouseInbound queryById(Integer id) {
        return this.warehouseInboundMapper.queryById(id);
    }


    /**
     * 查询入库单
     *
     * @param checkTag 入库审核状态
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<WarehouseInbound> queryInboundLimit(String checkTag,int offset,int limit){
        return this.warehouseInboundMapper.queryInboundLimit(checkTag, offset, limit);
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

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.warehouseInboundMapper.deleteById(id) > 0;
    }
}