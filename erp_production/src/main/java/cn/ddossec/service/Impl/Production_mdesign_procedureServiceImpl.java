package cn.ddossec.service.Impl;

import cn.ddossec.domain.Production_mdesign_procedure;
import cn.ddossec.mapper.Production_mdesign_procedureMapper;
import cn.ddossec.service.Production_mdesign_procedureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Production_mdesign_procedureServiceImpl implements Production_mdesign_procedureService {

    @Autowired
    private Production_mdesign_procedureMapper production_mdesign_procedureMapper;

    @Override
    public List<Production_mdesign_procedure> findAllProduction_mdesign_procedure() {
        return production_mdesign_procedureMapper.findAllProduction_mdesign_procedure();
    }

    @Override
    public List<Production_mdesign_procedure> findAllProduction_mdesign_procedure_sh() {
        return production_mdesign_procedureMapper.findAllProduction_mdesign_procedure_sh();
    }

    @Override
    public int delProduction_mdesign_procedureById(Integer id) {
        return production_mdesign_procedureMapper.delProduction_mdesign_procedureById(id);
    }

    @Override
    public void insertProduction_mdesign_procedure(Production_mdesign_procedure production_mdesign_procedure ) {
        production_mdesign_procedureMapper.insertProduction_mdesign_procedure(production_mdesign_procedure);
    }

    @Override
    public boolean updateProduction_mdesign_procedure(Production_mdesign_procedure production_mdesign_procedure) {
        return production_mdesign_procedureMapper.updateProduction_mdesign_procedure(production_mdesign_procedure);
    }

    @Override
    public Production_mdesign_procedure selectById(Integer id) {
        return production_mdesign_procedureMapper.selectById(id);
    }


}
