package cn.ddosec.production.mapper;

import cn.ddosec.production.pojo.production_process_design_sheet;
import cn.ddosec.production.pojo.production_process_design_sheetQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface production_process_design_sheetmapper {
    int countByExample(production_process_design_sheetQuery example);

    int deleteByExample(production_process_design_sheetQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(production_process_design_sheet record);

    int insertSelective(production_process_design_sheet record);

    List<production_process_design_sheet> selectByExample(production_process_design_sheetQuery example);

    production_process_design_sheet selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") production_process_design_sheet record, @Param("example") production_process_design_sheetQuery example);

    int updateByExample(@Param("record") production_process_design_sheet record, @Param("example") production_process_design_sheetQuery example);

    int updateByPrimaryKeySelective(production_process_design_sheet record);

    int updateByPrimaryKey(production_process_design_sheet record);
}
