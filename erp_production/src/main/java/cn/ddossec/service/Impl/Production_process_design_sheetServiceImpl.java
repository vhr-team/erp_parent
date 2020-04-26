package cn.ddossec.service.Impl;

import cn.ddossec.domain.Production_mdesign_procedure;
import cn.ddossec.domain.Production_process_design_sheet;
import cn.ddossec.mapper.Production_process_design_sheetMapper;
import cn.ddossec.service.Production_process_design_sheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Production_process_design_sheetServiceImpl implements Production_process_design_sheetService {

    @Autowired
    Production_process_design_sheetMapper production_process_design_sheetMapper;

    @Override
    public List<Production_process_design_sheet> findAllProductionSheet() {
        return production_process_design_sheetMapper.findAllProductionSheet();
    }

    @Override
    public int delProductionSheetById(Integer id) {
        return production_process_design_sheetMapper.delProductionSheetById(id);
    }

    @Override
    public void insertProductionSheet(Production_process_design_sheet production_process_design_sheet) {
        production_process_design_sheetMapper.insertProductionSheet(production_process_design_sheet);
    }

    @Override
    public boolean updateProductionSheet(Production_process_design_sheet production_process_design_sheet) {
        return production_process_design_sheetMapper.updateProductionSheet(production_process_design_sheet);
    }

    @Override
    public Production_mdesign_procedure selectById(Integer id) {
        return production_process_design_sheetMapper.selectById(id);
    }
}
