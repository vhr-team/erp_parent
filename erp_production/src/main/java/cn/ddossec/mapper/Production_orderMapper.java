package cn.ddossec.mapper;

import cn.ddossec.domain.Production_order;

import java.util.List;

public interface Production_orderMapper {

    public List<Production_order> findAllProductionOrder();

    public void insertProductionOrder(Production_order production_order);

    public boolean updateProductionOrder(String id);

    /*根据id查询再修改**/
    public Production_order selectById(Integer id);

    public List<Production_order> findByProduction_generate();

    public boolean updatechecked_audit(String id);

    public List<Production_order> findByChecked_audit();


    public List<Production_order> findByAdd_status();

    public boolean updateAdd_status(String id);

}
