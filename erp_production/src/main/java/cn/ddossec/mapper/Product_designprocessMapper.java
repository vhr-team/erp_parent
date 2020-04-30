package cn.ddossec.mapper;

import cn.ddossec.domain.Product_designprocess;
import cn.ddossec.domain.Production_mdesign_procedure;
import cn.ddossec.domain.Product_designprocess;

import java.util.List;

/**
 * 设计单中的工序
 */
public interface Product_designprocessMapper {


    /*查询所有数据**/
    public List<Product_designprocess> findAllProduction_modesign_procedure();

    /**
     * 根据产品编号查询单中的工序
     * @param design_id
     * @return
     */
    public  List<Product_designprocess>   findDId(String  design_id);

    /**
     * 添加
     *
     */
    public int insertProduction_modesign_procedure( Product_designprocess product_designprocess);
}
