package cn.ddossec.service.impl;

import cn.ddossec.common.Constants;
import cn.ddossec.common.DataGridView;
import cn.ddossec.domain.Basics_supper;
import cn.ddossec.domain.OrderModel;
import cn.ddossec.domain.User;
import cn.ddossec.mapper.OrderModelMapper;
import cn.ddossec.service.OrderModelService;
import cn.ddossec.service.feign.BasicsSupperFeign;
import cn.ddossec.service.feign.UserFeign;
import cn.ddossec.vo.OrderModelVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@Slf4j
public class OrderModelServiceImpl extends ServiceImpl<OrderModelMapper, OrderModel> implements OrderModelService {

    @Autowired
    private OrderModelMapper orderModelMapper;

    @Autowired
    private BasicsSupperFeign basicsSupperFeign;
    @Autowired
    private UserFeign userFeign;

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
        qw.eq("order_type", Constants.ORDER_TYPE_BUY);
        qw.eq(null != orderModelVo.getOrderState(), "order_state", orderModelVo.getOrderState());
        qw.eq(null != orderModelVo.getCreater(), "creater", orderModelVo.getCreater());

        qw.ge(null != orderModelVo.getMinTotalNum(), "total_num", orderModelVo.getMinTotalNum());
        qw.le(null != orderModelVo.getMaxTotalNum(), "total_num", orderModelVo.getMaxTotalNum());

        qw.ge(null != orderModelVo.getStartTime(), "creater_time", orderModelVo.getStartTime());
        qw.le(null != orderModelVo.getEndTime(), "creater_time", orderModelVo.getEndTime());

        qw.ge(null != orderModelVo.getMinTotalPrice(), "total_price", orderModelVo.getMinTotalPrice());
        qw.le(null != orderModelVo.getMaxTotalPrice(), "total_price", orderModelVo.getMaxTotalPrice());

        this.baseMapper.selectPage(page, qw);
        List<OrderModel> modelList = page.getRecords();
        for (OrderModel model : modelList) {
            // 3.翻译供应商
            List<Basics_supper> allSupper = this.basicsSupperFeign.getAllSupper();
            for (Basics_supper supper : allSupper) {
                if (null != model.getSupplierId() && model.getSupplierId().equals(supper.getId())) {
                    model.setSupplierName(supper.getName());
                }
            }

            List<User> userList = this.userFeign.loadAllUser();
            for (User user : userList) {
                if (null != model.getCreater() && model.getCreater().equals(user.getId())) {
                    model.setCheckerName(user.getName());
                }
            }
        }

        return new DataGridView(page.getTotal(), page.getRecords());
    }
}