package com.rbac.design.mapper;

import com.rbac.design.pojo.design_record;
import com.rbac.design.pojo.design_recordQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;
@Mapper
public interface design_recordmapper {
    int countByExample(design_recordQuery example);

    int deleteByExample(design_recordQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(design_record record);

    int insertSelective(design_record record);

    List<design_record> selectByExample(design_recordQuery example);

    design_record selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") design_record record, @Param("example") design_recordQuery example);

    int updateByExample(@Param("record") design_record record, @Param("example") design_recordQuery example);

    int updateByPrimaryKeySelective(design_record record);

    int updateByPrimaryKey(design_record record);

    @Update("update product_design_record set check_time=#{checkTime} , checker=#{checker},check_tag=#{checkTag} where id=#{id} ")
    int miuticheck(@Param("checker") String checker, @Param("checkTag") String checkTag, @Param("id") Integer id, @Param("checkTime") String checkTime);
}
