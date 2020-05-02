package cn.ddosec.design.mapper;

import cn.ddosec.design.pojo.product_material_archives;
import cn.ddosec.design.pojo.product_material_archivesQuery;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface product_material_archivesmapper {
    int countByExample(product_material_archivesQuery example);

    int deleteByExample(product_material_archivesQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(product_material_archives record);

    int insertSelective(product_material_archives record);

    List<product_material_archives> selectByExample(product_material_archivesQuery example);

    product_material_archives selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") product_material_archives record, @Param("example") product_material_archivesQuery example);

    int updateByExample(@Param("record") product_material_archives record, @Param("example") product_material_archivesQuery example);

    int updateByPrimaryKeySelective(product_material_archives record);

    int updateByPrimaryKey(product_material_archives record);

    @Select("select * from product_material_archives where productid=#{Id} ")
    List<product_material_archives> selectByID(String Id);

    @Select("select count(*) from product_material_archives where productid=#{ID}  ")
    int selectcount(String ID);


}
