package cn.ddossec.service.Impl;

import cn.ddossec.domain.Production_process_design_alteration;
import cn.ddossec.domain.Production_process_design_sheet;
import cn.ddossec.mapper.Production_process_design_alterationMapper;
import cn.ddossec.service.Production_process_design_alterationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Production_process_design_alterationServiceImpl implements Production_process_design_alterationService {

    @Autowired
    Production_process_design_alterationMapper production_process_design_alterationMapper;


    @Override
    public List<Production_process_design_alteration> findAllProductionAlteration() {
        return production_process_design_alterationMapper.findAllProductionAlteration();
    }

    @Override
    public int delProductionAlterationById(Integer id) {
        return production_process_design_alterationMapper.delProductionAlterationById(id);
    }

    @Override
    public void insertProductionAlteration(Production_process_design_alteration production_process_design_alteration) {
        production_process_design_alterationMapper.insertProductionAlteration(production_process_design_alteration);
    }

    @Override
    public boolean updateProductionAlteration(Production_process_design_alteration production_process_design_alteration) {
        return production_process_design_alterationMapper.updateProductionAlteration(production_process_design_alteration);
    }

    @Override
    public Production_process_design_sheet selectById(Integer id) {
        return production_process_design_alterationMapper.selectById(id);
    }
}
