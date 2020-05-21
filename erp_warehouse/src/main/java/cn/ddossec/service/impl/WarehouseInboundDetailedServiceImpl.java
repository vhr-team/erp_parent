package cn.ddossec.service.impl;

import cn.ddossec.common.DataGridView;
import cn.ddossec.common.Response;
import cn.ddossec.domain.WarehouseInbound;
import cn.ddossec.domain.WarehouseInboundDetailed;
import cn.ddossec.mapper.WarehouseInboundDetailedMapper;
import cn.ddossec.service.WarehouseInboundDetailedService;
import cn.ddossec.service.WarehouseInboundService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * (WarehouseInboundDetailed)表服务实现类
 *
 * @author 谷辉
 * @since 2020-04-24 17:08:29
 */
@SuppressWarnings("all")
@Service("warehouseInboundDetailedServiceImpl")
public class WarehouseInboundDetailedServiceImpl implements WarehouseInboundDetailedService {
    @Autowired
    private WarehouseInboundDetailedMapper warehouseInboundDetailedMapper;

    @Autowired
    private WarehouseInboundService warehouseInboundServiceImpl;


    @Override
    public Response insertInboundDetailedAmount(WarehouseInbound warehouseInbound) {
        return null;
    }

    /**
     * 入库调度提交
     *
     * @param id 入库详细单序号
     * @param parent_id 父级序号
     * @param gatherTag 库存标志 1为已登记 2为已调度
     * @param attemper 调度人
     * @return
     */
    @Override
    public Response InboundDetailedCommit(Integer id, Integer parent_id, String gatherTag, String attemper) {
        try {
            WarehouseInboundDetailed detailed = new WarehouseInboundDetailed();
            detailed.setId(id);
            detailed.setGatherTag(gatherTag);
            warehouseInboundDetailedMapper.updateById(detailed);
            updatestoreTag(parent_id, attemper);
            return new Response(true,"提交成功!");
        }catch (Exception e){
            e.printStackTrace();
            return new Response(false,"提交失败,请重试!");
        }
    }

    /**
     *通过父级序号查询所有入库标志
     *
     * @param parent_id 父级序号
     * @param attemper 调度人
     */
    @Override
    public void updatestoreTag(Integer parent_id, String attemper) {
        QueryWrapper<WarehouseInboundDetailed> queryWrapper = new QueryWrapper();
        queryWrapper.select("gather_tag").eq("parent_id",parent_id);
        List<WarehouseInboundDetailed> list = warehouseInboundDetailedMapper.selectList(queryWrapper);
        int size = list.size();
        int count = 0;
        for (WarehouseInboundDetailed detailed : list) {
            if ("2".equals(detailed.getGatherTag())){
                count++;
            }
        }
        if (size == count){
            warehouseInboundServiceImpl.updateStoreTag(parent_id,"2",attemper);
        }
    }

    /**
     * 入库调度表的调度查询
     *
     * @param id 父级序号
     * @param page
     * @param limit
     * @return
     */
    @Override
    public DataGridView queryInboundDetailed(Integer id, int page, int limit) {
        QueryWrapper<WarehouseInboundDetailed> queryWrapper = new QueryWrapper<>();
                                                            //编号 父级编号 产品编号 产品名称  数量  确认入库件数  单价
        queryWrapper.eq("parent_id",id).select("id","parent_id","product_id","product_name","amount","gathered_amount","cost_price");
        Page<WarehouseInboundDetailed> pages = new Page<>(page,limit);
        IPage iPage = warehouseInboundDetailedMapper.selectPage(pages,queryWrapper);
        return new DataGridView(iPage.getTotal(),iPage.getRecords());
    }


    /**
     * 插入入库详细表
     * @param warehouseInboundDetailed
     * @return
     */
    @Override
    public void insertWarehouseDetailed(WarehouseInboundDetailed warehouseInboundDetailed) {
        warehouseInboundDetailedMapper.insert(warehouseInboundDetailed);
    }

}