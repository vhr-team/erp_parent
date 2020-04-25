package cn.ddossec.mapper;

import cn.ddossec.domain.Production_process_design_sheet;

import java.util.List;

public interface Production_process_design_sheetMapper {


    public List<Production_process_design_sheet> finfAllProduction_process_design_sheet();

    public int delProduction_process_design_sheetById(Integer id);

    public void insertProduction_process_design_sheet(Production_process_design_sheet production_process_design_sheet);

    public boolean updateProduction_process_design_sheet(Production_process_design_sheet production_process_design_sheet);

    public Production_process_design_sheet selectById(Integer id);
}
