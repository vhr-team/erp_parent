package cn.ddossec.service.impl;

import cn.ddossec.domain.ProductType;
import cn.ddossec.domain.Goods;
import cn.ddossec.domain.OrderDetail;
import cn.ddossec.mapper.OrderDetailMapper;
import cn.ddossec.service.OrderDetailService;
import cn.ddossec.service.feign.BasicsSupperFeign;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

    @Autowired
    private OrderDetailMapper orderDetailMapper;

    @Autowired
    private BasicsSupperFeign basicsSupperFeign;

    /**
     * 根据订单ID，查询订单明细
     *
     * @param orderId
     * @return
     */
    @Override
    public List<OrderDetail> getDetailByOrderId(Integer orderId) {

        // 1.根据订单ID，查询明细
        QueryWrapper<OrderDetail> qw = new QueryWrapper<>();
        qw.eq(null != orderId, "order_id", orderId);

        // 2.根据商品ID查询商品
        List<OrderDetail> orderDetails = orderDetailMapper.selectList(qw);
        List<OrderDetail> newArr = new ArrayList<>();
        for (OrderDetail detail : orderDetails) {
            // 3.翻译类别
            Goods goods = this.basicsSupperFeign.queryGoodsById(detail.getProductId());
            List<ProductType> productTypes = this.basicsSupperFeign.loadAllProductType();
            for (ProductType type : productTypes) {
                if (null != goods.getProducttypeid() && goods.getProducttypeid().equals(type.getProductTypeId())) {
                    goods.setProductname(type.getName());
                }
            }

            detail.setGoods(goods);
            newArr.add(detail);
        }

        return newArr;
    }
}
