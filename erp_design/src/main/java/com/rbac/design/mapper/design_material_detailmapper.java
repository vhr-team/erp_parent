package com.rbac.design.mapper;

import com.rbac.design.pojo.design_material_detail;
import com.rbac.design.pojo.design_material_detailQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

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
}
