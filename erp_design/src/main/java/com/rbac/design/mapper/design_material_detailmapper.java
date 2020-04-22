package com.rbac.design.mapper;

import com.rbac.design.pojo.design_material_detail;
import com.rbac.design.pojo.design_material_detailQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface design_material_detailmapper {
    int countByExample(design_material_detailQuery example);

    int deleteByExample(design_material_detailQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(design_material_detail record);

    int insertSelective(design_material_detail record);

    List<design_material_detail> selectByExample(design_material_detailQuery example);

    design_material_detail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") design_material_detail record, @Param("example") design_material_detailQuery example);

    int updateByExample(@Param("record") design_material_detail record, @Param("example") design_material_detailQuery example);

    int updateByPrimaryKeySelective(design_material_detail record);

    int updateByPrimaryKey(design_material_detail record);

    @Select("select id as id,product_id as productId  ,product_name as productName ,type as type ,product_describe as productDescribe ,amount_unit as amountUnit ,residual_amount as residualAmount ,cost_price as costPrice  from product_design_material_detail  where product_id=#{productId}  ")
    design_material_detail selectByproductId(String productId);

    @Update("update product_design_material_detail set type=#{type} , product_name=#{productName} ,product_describe=#{product_describe} ,amount_unit=#{amountUnit} where product_id=#{proid} ")
    int update_detail(@Param("proid") String proid, @Param("productName") String productName, @Param("type") String type, @Param("product_describe") String product_describe, @Param("amountUnit") String amountUnit);
}
