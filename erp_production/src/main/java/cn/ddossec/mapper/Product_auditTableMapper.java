package cn.ddossec.mapper;

import cn.ddossec.domain.Product_auditTable;
import cn.ddossec.domain.Product_designprocess;

import java.util.List;

/**
 * 设计单审核表
 */
public interface Product_auditTableMapper {
    /*查询所有没有审核过得数据**/
    public List<Product_auditTable> findAllProduct_auditTable();
    /*查询所有审核过得数据**/
    public List<Product_auditTable> IsfindAllProduct_auditTable();


    /**
     * 添加审核单
     * @return
     */
    public void insertProduct_auditTable(Product_auditTable product_auditTable);

    /**
     * 修改
     *
      */
    public void updatePeoduct_audit(String shState,Integer id);

}
