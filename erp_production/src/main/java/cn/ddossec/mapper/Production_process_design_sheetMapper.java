package cn.ddossec.mapper;

import cn.ddossec.domain.Production_process_design_sheet;

import java.util.List;

public interface Production_process_design_sheetMapper {


    public List<Production_process_design_sheet> findAll();

    public int addProduction_process_design_sheet(Production_process_design_sheet production_process_design_sheet);


}
