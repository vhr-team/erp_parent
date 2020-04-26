package cn.ddossec.mapper;

import cn.ddossec.domain.Production_process_design_sheet;

import java.util.List;

public interface Production_process_design_sheetMapper {


    public List<Production_process_design_sheet> findAllProductionSheet();

    public int delProductionSheetById(Integer id);

    public void insertProductionSheet(Production_process_design_sheet production_process_design_sheet);

    public boolean updateProductionSheet(Production_process_design_sheet production_process_design_sheet);

    public Production_process_design_sheet selectById(Integer id);
}
