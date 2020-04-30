package cn.ddosec.sale.mapper;

import cn.ddosec.sale.pojo.sale_order_detail;
import cn.ddosec.sale.pojo.sale_order_detailQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface sale_order_detailmapper {
    int countByExample(sale_order_detailQuery example);

    int deleteByExample(sale_order_detailQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(sale_order_detail record);

    int insertSelective(sale_order_detail record);

    List<sale_order_detail> selectByExample(sale_order_detailQuery example);

    sale_order_detail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") sale_order_detail record, @Param("example") sale_order_detailQuery example);

    int updateByExample(@Param("record") sale_order_detail record, @Param("example") sale_order_detailQuery example);

    int updateByPrimaryKeySelective(sale_order_detail record);

    int updateByPrimaryKey(sale_order_detail record);
}
