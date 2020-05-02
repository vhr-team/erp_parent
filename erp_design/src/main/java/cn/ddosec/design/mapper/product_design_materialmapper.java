package cn.ddosec.design.mapper;

import cn.ddosec.design.pojo.product_design_material;
import cn.ddosec.design.pojo.product_design_materialQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface product_design_materialmapper {
    int countByExample(product_design_materialQuery example);

    int deleteByExample(product_design_materialQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(product_design_material record);

    int insertSelective(product_design_material record);

    List<product_design_material> selectByExample(product_design_materialQuery example);

    product_design_material selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") product_design_material record, @Param("example") product_design_materialQuery example);

    int updateByExample(@Param("record") product_design_material record, @Param("example") product_design_materialQuery example);

    int updateByPrimaryKeySelective(product_design_material record);

    int updateByPrimaryKey(product_design_material record);
}
