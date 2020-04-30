package cn.ddosec.design.mapper;

import cn.ddosec.design.pojo.product_design_record;
import cn.ddosec.design.pojo.product_design_recordQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface product_design_recordmapper {
    int countByExample(product_design_recordQuery example);

    int deleteByExample(product_design_recordQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(product_design_record record);

    int insertSelective(product_design_record record);

    List<product_design_record> selectByExample(product_design_recordQuery example);

    product_design_record selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") product_design_record record, @Param("example") product_design_recordQuery example);

    int updateByExample(@Param("record") product_design_record record, @Param("example") product_design_recordQuery example);

    int updateByPrimaryKeySelective(product_design_record record);

    int updateByPrimaryKey(product_design_record record);


}
