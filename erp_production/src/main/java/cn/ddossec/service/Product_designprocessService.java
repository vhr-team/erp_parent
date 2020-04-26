package cn.ddossec.service;

import cn.ddossec.domain.Product_designprocess;

import java.util.List;

public interface Product_designprocessService {



    /*查询所有数据**/
    public List<Product_designprocess> findAllProduction_modesign_procedure();


    /**
     * 添加
     *
     */
    public int insertProduction_modesign_procedure(Product_designprocess product_designprocess);
}
