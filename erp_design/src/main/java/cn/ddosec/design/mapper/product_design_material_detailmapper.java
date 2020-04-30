package cn.ddosec.design.mapper;

import cn.ddosec.design.pojo.product_design_material_detail;
import cn.ddosec.design.pojo.product_design_material_detailQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface product_design_material_detailmapper {
    int countByExample(product_design_material_detailQuery example);

    int deleteByExample(product_design_material_detailQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(product_design_material_detail record);

    int insertSelective(product_design_material_detail record);

    List<product_design_material_detail> selectByExample(product_design_material_detailQuery example);

    product_design_material_detail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") product_design_material_detail record, @Param("example") product_design_material_detailQuery example);

    int updateByExample(@Param("record") product_design_material_detail record, @Param("example") product_design_material_detailQuery example);

    int updateByPrimaryKeySelective(product_design_material_detail record);

    int updateByPrimaryKey(product_design_material_detail record);
}
