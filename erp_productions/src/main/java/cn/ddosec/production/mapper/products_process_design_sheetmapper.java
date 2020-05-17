package cn.ddosec.production.mapper;

import cn.ddosec.production.pojo.products_process_design_sheet;
import cn.ddosec.production.pojo.products_process_design_sheetQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface products_process_design_sheetmapper {
    int countByExample(products_process_design_sheetQuery example);

    int deleteByExample(products_process_design_sheetQuery example);

    int deleteByPrimaryKey(Integer id);

    int insert(products_process_design_sheet record);

    int insertSelective(products_process_design_sheet record);

    List<products_process_design_sheet> selectByExample(products_process_design_sheetQuery example);

    products_process_design_sheet selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") products_process_design_sheet record, @Param("example") products_process_design_sheetQuery example);

    int updateByExample(@Param("record") products_process_design_sheet record, @Param("example") products_process_design_sheetQuery example);

    int updateByPrimaryKeySelective(products_process_design_sheet record);

    int updateByPrimaryKey(products_process_design_sheet record);
}
