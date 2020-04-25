package cn.ddossec.service.Impl;

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
    public List<Production_process_design_sheet> finfAllProduction_process_design_sheet() {
        return production_process_design_sheetMapper.finfAllProduction_process_design_sheet();
    }

    @Override
    public int delProduction_process_design_sheetById(Integer id) {
        return production_process_design_sheetMapper.delProduction_process_design_sheetById(id);
    }

    @Override
    public void insertProduction_mdesign_procedure(Production_process_design_sheet production_process_design_sheet) {
        production_process_design_sheetMapper.insertProduction_process_design_sheet(production_process_design_sheet);
    }


    @Override
    public boolean updateProduction_process_design_sheet(Production_process_design_sheet production_process_design_sheet) {
        return production_process_design_sheetMapper.updateProduction_process_design_sheet(production_process_design_sheet);
    }

    @Override
    public Production_process_design_sheet selectById(Integer id) {
        return production_process_design_sheetMapper.selectById(id);
    }
}
