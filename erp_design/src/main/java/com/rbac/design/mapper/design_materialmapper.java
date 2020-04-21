package com.rbac.design.mapper;

import com.rbac.design.pojo.design_material;
import com.rbac.design.pojo.design_materialQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface design_materialmapper {
    int countByExample(design_materialQuery example);

    int deleteByExample(design_materialQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(design_material record);

    int insertSelective(design_material record);

    List<design_material> selectByExample(design_materialQuery example);

    design_material selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") design_material record, @Param("example") design_materialQuery example);

    int updateByExample(@Param("record") design_material record, @Param("example") design_materialQuery example);

    int updateByPrimaryKeySelective(design_material record);

    int updateByPrimaryKey(design_material record);
}
