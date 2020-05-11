package cn.ddossec.service.impl;

import cn.ddossec.common.DataGridView;
import cn.ddossec.domain.WarehouseInboundDetailed;
import cn.ddossec.mapper.WarehouseInboundDetailedMapper;
import cn.ddossec.service.WarehouseInboundDetailedService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
        queryWrapper.eq("parent_id",id).select("id","product_id","product_name","amount","gathered_amount");
        Page<WarehouseInboundDetailed> pages = new Page<>(page,limit);
        IPage iPage = warehouseInboundDetailedMapper.selectPage(pages,queryWrapper);
        return new DataGridView(iPage.getTotal(),iPage.getRecords());
    }

}