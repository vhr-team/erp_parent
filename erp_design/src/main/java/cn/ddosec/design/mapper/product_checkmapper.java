package cn.ddosec.design.mapper;

import cn.ddosec.design.pojo.product_check;
import cn.ddosec.design.pojo.product_checkQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface product_checkmapper {
    int countByExample(product_checkQuery example);

    int deleteByExample(product_checkQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(product_check record);

    int insertSelective(product_check record);

    List<product_check> selectByExample(product_checkQuery example);

    product_check selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") product_check record, @Param("example") product_checkQuery example);

    int updateByExample(@Param("record") product_check record, @Param("example") product_checkQuery example);

    int updateByPrimaryKeySelective(product_check record);

    int updateByPrimaryKey(product_check record);
}
