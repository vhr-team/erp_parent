package cn.ddosec.sale.mapper;

import cn.ddosec.sale.pojo.sale_order;
import cn.ddosec.sale.pojo.sale_orderQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface sale_ordermapper {
    int countByExample(sale_orderQuery example);

    int deleteByExample(sale_orderQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(sale_order record);

    int insertSelective(sale_order record);

    List<sale_order> selectByExample(sale_orderQuery example);

    sale_order selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") sale_order record, @Param("example") sale_orderQuery example);

    int updateByExample(@Param("record") sale_order record, @Param("example") sale_orderQuery example);

    int updateByPrimaryKeySelective(sale_order record);

    int updateByPrimaryKey(sale_order record);
}
