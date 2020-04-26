package cn.ddossec.service;

import cn.ddossec.domain.Production_mdesign_procedure;
import cn.ddossec.domain.Production_process_design_sheet;

import java.util.List;

public interface Production_process_design_sheetService {

    /*查询所有**/
    public List<Production_process_design_sheet> findAllProductionSheet();

    /*根据id删除**/
    public int delProductionSheetById(Integer id);

    /*添加**/
    public void insertProductionSheet(Production_process_design_sheet production_process_design_sheet);

    /*修改**/
    public boolean updateProductionSheet(Production_process_design_sheet production_process_design_sheet);

    /*根据id查询再修改**/
    public Production_mdesign_procedure selectById(Integer id);
}
