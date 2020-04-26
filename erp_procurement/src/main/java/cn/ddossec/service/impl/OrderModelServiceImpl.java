package cn.ddossec.service.impl;

import cn.ddossec.common.DataGridView;
import cn.ddossec.domain.OrderModel;
import cn.ddossec.mapper.OrderModelMapper;
import cn.ddossec.service.OrderModelService;
import cn.ddossec.vo.OrderModelVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@Slf4j
public class OrderModelServiceImpl extends ServiceImpl<OrderModelMapper, OrderModel> implements OrderModelService {

    @Autowired
    private OrderModelMapper orderModelMapper;

    /**
     * 查询所有订单，可以带条件，分页查询
     *
     * @param orderModelVo
     * @return
     */
    @Override
    public DataGridView queryAllOrderModel(OrderModelVo orderModelVo) {
        // 1.设置分页
        IPage<OrderModel> page = new Page<>(orderModelVo.getPage(), orderModelVo.getPageSize());

        QueryWrapper<OrderModel> qw = new QueryWrapper<>();

        // 2.根据创建人ID查询创建人信息
        qw.eq(null != orderModelVo.getCreater(), "creater", orderModelVo.getCreater());

        qw.ge(null != orderModelVo.getMinTotalNum(), "total_num", orderModelVo.getMinTotalNum());
        qw.le(null != orderModelVo.getMaxTotalNum(), "total_num", orderModelVo.getMaxTotalNum());

        qw.ge(null != orderModelVo.getMinCreateTime(), "creater_time", orderModelVo.getMinCreateTime());
        qw.le(null != orderModelVo.getMaxCreateTime(), "creater_time", orderModelVo.getMaxCreateTime());

        qw.ge(null != orderModelVo.getMinTotalPrice(), "total_price", orderModelVo.getMinTotalPrice());
        qw.le(null != orderModelVo.getMaxTotalPrice(), "total_price", orderModelVo.getMaxTotalPrice());

        this.baseMapper.selectPage(page, qw);

        return new DataGridView(page.getTotal(), page.getRecords());
    }
}