package cn.ddossec.service.impl;

import cn.ddossec.common.DataGridView;
import cn.ddossec.common.Response;
import cn.ddossec.domain.WarehouseInboundDetailed;
import cn.ddossec.domain.WarehouseOutbound;
import cn.ddossec.domain.WarehouseOutboundDetailed;
import cn.ddossec.mapper.WarehouseOutboundDetailedMapper;
import cn.ddossec.service.WarehouseOutboundDetailedService;
import cn.ddossec.service.WarehouseOutboundService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * (WarehouseOutboundDetailed)表服务实现类
 *
 * @author 谷辉
 * @since 2020-04-22 15:33:29
 */
@SuppressWarnings("all")
@Service("warehouseOutboundDetailedServiceImpl")
public class WarehouseOutboundDetailedServiceImpl implements WarehouseOutboundDetailedService {
    @Autowired
    private WarehouseOutboundDetailedMapper warehouseOutboundDetailedMapper;

    @Autowired
    private WarehouseOutboundService warehouseOutboundService;


    /**
     * 出库调度提交
     *
     * @param id 详细表 序号
     * @param parent_id 详细表 父级序号
     * @param attemper 调度人
     * @param pay_tag 详细表 出库标志
     * @return
     */
    @Override
    @Transactional
    public Response OutboundDetailedCommit(Integer id, Integer parent_id, String attemper, String pay_tag) {
        try {
            WarehouseOutboundDetailed detailed = new WarehouseOutboundDetailed();
            detailed.setId(id);
            detailed.setPayTag(pay_tag);
            warehouseOutboundDetailedMapper.updateById(detailed); //修改出库详细表的 出库标志
            updateOutboundStoreTag(parent_id,attemper); //判断修改出库单 库存标志
            return new Response(true,"提交成功!");
        }catch (Exception e){
            e.printStackTrace();
            return new Response(false,"提交失败,请重试!");
        }
    }

    /**
     * 修改出库单库存标志
     *
     * @param parent_id 父级序号
     * @param attemper 调度人
     */
    @Override
    public void updateOutboundStoreTag(Integer parent_id, String attemper) {
        QueryWrapper<WarehouseOutboundDetailed> queryWrapper = new QueryWrapper();
        queryWrapper.select("pay_tag").eq("parent_id",parent_id);
        List<WarehouseOutboundDetailed> list = warehouseOutboundDetailedMapper.selectList(queryWrapper);
        int size = list.size();
        int count = 0;
        for (WarehouseOutboundDetailed detailed : list) {
            if ("2".equals(detailed.getPayTag())){
                count++;
            }
        }
        if (size==count){
            warehouseOutboundService.updateStoreTag(parent_id,"2",attemper);//修改出库单库存标志
        }

    }

    /**
     * 修改出库标志
     *
     * @param detailed
     */
    @Override
    public void updateDetailedPayTag(WarehouseOutboundDetailed detailed) {
        warehouseOutboundDetailedMapper.updateById(detailed);
    }

    /**
     *查询出库详细单
     *
     * @param id
     * @return
     */
    @Override
    public DataGridView queryWarehouseOutboundDetailed(Integer page,Integer limit,Integer id) {
        QueryWrapper<WarehouseOutboundDetailed> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("parent_id",id).select("id","product_name","product_id","product_describe","amount","amount_unit","cost_price","subtotal");
        Page<WarehouseOutboundDetailed> pages = new Page<>();
        IPage iPage = warehouseOutboundDetailedMapper.selectPage(pages,queryWrapper);
        return new DataGridView(iPage.getTotal(),iPage.getRecords());
    }


    /**
     * 添加出库申请详细单
     *
     * @param warehouseOutboundDetailed
     */
    @Override
    public void addWarehouseOutboundDetailed(WarehouseOutboundDetailed warehouseOutboundDetailed) {
        warehouseOutboundDetailedMapper.insert(warehouseOutboundDetailed);
    }
}