package cn.ddossec.service;

import cn.ddossec.domain.Production_order;

import java.util.List;

public interface Production_orderService {

    public List<Production_order> findAllProductionOrder();

    public void insertProductionOrder(Production_order production_order);
}
