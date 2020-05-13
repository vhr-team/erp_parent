package cn.ddosec.production.mapper;

import cn.ddosec.production.pojo.production_process_design_alteration;
import cn.ddosec.production.pojo.production_process_design_alterationQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface production_process_design_alterationmapper {
    int countByExample(production_process_design_alterationQuery example);

    int deleteByExample(production_process_design_alterationQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(production_process_design_alteration record);

    int insertSelective(production_process_design_alteration record);

    List<production_process_design_alteration> selectByExample(production_process_design_alterationQuery example);

    production_process_design_alteration selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") production_process_design_alteration record, @Param("example") production_process_design_alterationQuery example);

    int updateByExample(@Param("record") production_process_design_alteration record, @Param("example") production_process_design_alterationQuery example);

    int updateByPrimaryKeySelective(production_process_design_alteration record);

    int updateByPrimaryKey(production_process_design_alteration record);
}
