package cn.ddossec.mapper;

import cn.ddossec.domain.Production_order;

import java.util.List;

public interface Production_orderMapper {

    public List<Production_order> findAllProductionOrder();

    public void insertProductionOrder(Production_order production_order);

    public List<Production_order> findByFields();
}
