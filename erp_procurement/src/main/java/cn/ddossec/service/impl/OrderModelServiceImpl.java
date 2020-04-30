package cn.ddossec.service.impl;

import cn.ddossec.common.Constants;
import cn.ddossec.common.DataGridView;
import cn.ddossec.domain.*;
import cn.ddossec.mapper.ConsoleLogMapper;
import cn.ddossec.mapper.OrderDetailMapper;
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

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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

    @Autowired
    private OrderDetailMapper orderDetailMapper;

    @Autowired
    private ConsoleLogMapper consoleLogMapper;

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

        qw.orderByDesc("creater_time");

        this.baseMapper.selectPage(page, qw);
        List<OrderModel> modelList = page.getRecords();
        List<User> userList = this.userFeign.loadAllUser();
        // 3.翻译供应商
        List<Basics_supper> allSupper = this.basicsSupperFeign.getAllSupper();

        for (OrderModel model : modelList) {
            for (Basics_supper supper : allSupper) {
                if (null != model.getSupplierId() && model.getSupplierId().equals(supper.getId())) {
                    model.setSupplierName(supper.getName());
                }
            }

            for (User user : userList) {
                if (null != model.getCreater() && model.getCreater().equals(user.getId())) {
                    model.setCheckerName(user.getName());
                }
            }
        }

        System.out.println(modelList);
        return new DataGridView(page.getTotal(), modelList);
    }

    /**
     * 添加采购单
     *
     * @param orderModel
     */
    @Override
    public void addOrder(OrderModel orderModel) {
        int totalNum = 0;
        double totalPrice = 0;

        // 1.设置订单号
        orderModel.setOrderNum(new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date()));
        // 3.采购时间
        orderModel.setCreaterTime(new Date());
        // 4.订单类型
        orderModel.setOrderType(new Integer(Constants.ORDER_TYPE_BUY));
        // 5.订单状态
        orderModel.setOrderState(new Integer(Constants.ORDER_TYPE_BUY_AUDIT));

        List<OrderDetail> orderDetails = new ArrayList<>();

        for (int i = 0; i < orderModel.getProductTypeId().length; i++) {
            // 订单明细
            OrderDetail detail = new OrderDetail();
            detail.setDetailNum(orderModel.getDetailNum()[i]);// 数量
            detail.setDetailPrice(orderModel.getDetailPrice()[i]);// 单价价格
            detail.setProductId(orderModel.getGoodsId()[i]);// 商品
            // 剩余数量
            detail.setSurplus(orderModel.getDetailNum()[i]);

            totalNum = totalNum + orderModel.getDetailNum()[i];
            totalPrice = totalPrice + orderModel.getDetailNum()[i] * orderModel.getDetailPrice()[i];

            orderDetails.add(detail);
        }

        orderModel.setTotalNum(totalNum);
        orderModel.setTotalPrice(totalPrice);
        orderModel.setDetails(orderDetails);

        this.orderModelMapper.insert(orderModel);
        log.debug("保存订单成功！");

        List<OrderDetail> newOrderDetails = new ArrayList<>();
        for (OrderDetail detail : orderDetails) {
            detail.setOrderId(orderModel.getOrderId());
            newOrderDetails.add(detail);
        }

        // 保存订单明细
        saveOrderDetail(newOrderDetails);
        log.debug("保存订单明细成功");
    }

    /**
     * 审核订单
     * @param orderModel
     */
    @Override
    public void auditOrder(OrderModel orderModel) {
        OrderModel order = this.orderModelMapper.selectById(orderModel.getOrderId());
        // 订单状态
        order.setOrderState(orderModel.getOrderState());
        // 审核人
        order.setChecker(orderModel.getChecker());
        // 审核时间
        order.setCheckTime(new Date());

        // ---------- 创建一个日志对象
        ConsoleLog c1 = new ConsoleLog();
        c1.setEmpId(orderModel.getChecker());
        c1.setEntityId(orderModel.getOrderId());
        c1.setNote(orderModel.getNote());
        c1.setOptTime(new Date());
        c1.setOptType("审核订单");
        c1.setTableName("bus_orderModel");

        this.consoleLogMapper.insert(c1);
        this.orderModelMapper.updateById(order);
    }

    public void saveOrderDetail(List<OrderDetail> orderDetails) {
        for (OrderDetail detail : orderDetails) {
            this.orderDetailMapper.insert(detail);
        }
    }
}