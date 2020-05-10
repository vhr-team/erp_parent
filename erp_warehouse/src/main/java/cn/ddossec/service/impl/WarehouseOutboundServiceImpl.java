package cn.ddossec.service.impl;

import cn.ddossec.common.DataGridView;
import cn.ddossec.domain.WarehouseOutbound;
import cn.ddossec.mapper.WarehouseOutboundMapper;
import cn.ddossec.service.WarehouseOutboundService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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
     * 查询可调度的数据进行调度
     * @param check_tag 审核标志
     * @param page
     * @param limit
     * @return
     */
    @Override
    public DataGridView queryWarehouseOutbound(String check_tag, Integer page, Integer limit) {
        QueryWrapper<WarehouseOutbound> queryWrapper = new QueryWrapper<>();
        //查询字段  序号，出库单编号，出库理由，登记时间，总件数，总金额(元)
        queryWrapper.select("id","outbound_id","reason","register_time","amount_sum","cost_price_sum").eq("check_tag",check_tag);
        Page<WarehouseOutbound> pages = new Page(page,limit);
        IPage iPage = warehouseOutboundMapper.selectPage(pages,queryWrapper);
        //  总共多少页   查询出来的所有数据
        return new DataGridView(iPage.getTotal(),iPage.getRecords());
    }

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
        return null;
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