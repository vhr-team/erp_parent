package cn.ddossec.service;

import cn.ddossec.domain.Product_auditTable;

import java.util.List;

public interface Product_auditTableService {


    /*查询所有审核过得数据**/
    public List<Product_auditTable> IsfindAllProduct_auditTable();
    /*查询所有没有审核过得数据**/
    public List<Product_auditTable> findAllProduct_auditTable();

    /**
     * 添加审核单
     * @return
     */
    public void insertProduct_auditTable();

    void auditSjdShb(String shState, String audit_date, Integer sjdId, Integer shdId);




}
