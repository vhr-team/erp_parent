package cn.ddosec.production.mapper;

import cn.ddosec.production.pojo.Product_auditTable;
import cn.ddosec.production.pojo.Product_auditTableQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Product_auditTablemapper {
    int countByExample(Product_auditTableQuery example);

    int deleteByExample(Product_auditTableQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(Product_auditTable record);

    int insertSelective(Product_auditTable record);

    List<Product_auditTable> selectByExample(Product_auditTableQuery example);

    Product_auditTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Product_auditTable record, @Param("example") Product_auditTableQuery example);

    int updateByExample(@Param("record") Product_auditTable record, @Param("example") Product_auditTableQuery example);

    int updateByPrimaryKeySelective(Product_auditTable record);

    int updateByPrimaryKey(Product_auditTable record);
}
