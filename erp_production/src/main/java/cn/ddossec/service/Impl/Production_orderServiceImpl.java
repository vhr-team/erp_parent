package cn.ddossec.service.Impl;

import cn.ddossec.domain.Production_order;
import cn.ddossec.mapper.Production_orderMapper;
import cn.ddossec.service.Production_orderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Production_orderServiceImpl implements Production_orderService {

    @Autowired
    Production_orderMapper production_orderMapper;


    @Override
    public List<Production_order> findAllProductionOrder() {
        return production_orderMapper.findAllProductionOrder();
    }

    @Override
    public void insertProductionOrder(Production_order production_order) {
        production_orderMapper.insertProductionOrder(production_order);
    }
}
