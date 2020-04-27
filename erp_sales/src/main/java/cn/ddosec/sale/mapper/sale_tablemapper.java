package cn.ddosec.sale.mapper;

import cn.ddosec.sale.pojo.sale_table;
import cn.ddosec.sale.pojo.sale_tableQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface sale_tablemapper {
    int countByExample(sale_tableQuery example);

    int deleteByExample(sale_tableQuery example);

    int deleteByPrimaryKey(Integer saleId);

    int insert(sale_table record);

    int insertSelective(sale_table record);

    List<sale_table> selectByExample(sale_tableQuery example);

    sale_table selectByPrimaryKey(Integer saleId);

    int updateByExampleSelective(@Param("record") sale_table record, @Param("example") sale_tableQuery example);

    int updateByExample(@Param("record") sale_table record, @Param("example") sale_tableQuery example);

    int updateByPrimaryKeySelective(sale_table record);

    int updateByPrimaryKey(sale_table record);
}
