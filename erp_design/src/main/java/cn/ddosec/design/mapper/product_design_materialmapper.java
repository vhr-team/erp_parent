package cn.ddosec.design.mapper;

import cn.ddosec.design.pojo.product_design_material;
import cn.ddosec.design.pojo.product_design_materialQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
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

    @Select("select product_id as productId,product_name as productName,product_describe as productDescribe,amount_unit as amountUnit, cost_price as costPrice,date,marterial_person as marterialPerson from product_design_material where product_id=#{Id}  ")
    product_design_material selectByproId(String Id);
}
