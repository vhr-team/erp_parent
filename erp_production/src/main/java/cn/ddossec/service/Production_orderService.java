package cn.ddossec.service;

import cn.ddossec.domain.Production_order;

import java.util.List;

public interface Production_orderService {

    public List<Production_order> findAllProductionOrder();

    public void insertProductionOrder(Production_order production_order);

    public boolean updateProductionOrder(String id);

    public Production_order selectById(Integer id);

    public List<Production_order> findByProduction_generate();

    public boolean updatechecked_audit(String id);

}
