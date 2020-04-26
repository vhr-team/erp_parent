package cn.ddossec.service;

import cn.ddossec.domain.Production_process_design_sheet;

import java.util.List;

public interface Production_process_design_sheetService {

    public List<Production_process_design_sheet> finfAllProduction_process_design_sheet();

    public int delProduction_process_design_sheetById(Integer id);

    public void insertProduction_mdesign_procedure(Production_process_design_sheet production_process_design_sheet);

    public boolean updateProduction_process_design_sheet(Production_process_design_sheet production_process_design_sheet);

    public Production_process_design_sheet selectById(Integer id);
}
