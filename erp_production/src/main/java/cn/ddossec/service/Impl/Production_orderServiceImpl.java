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

    @Override
    public boolean updateProductionOrder(String id) {
        return production_orderMapper.updateProductionOrder(id);
    }

    @Override
    public Production_order selectById(Integer id) {
        return production_orderMapper.selectById(id);
    }

    @Override
    public List<Production_order> findByProduction_generate() {
        return production_orderMapper.findByProduction_generate();
    }

    @Override
    public boolean updatechecked_audit(String id) {
        return production_orderMapper.updatechecked_audit(id);
    }


}
