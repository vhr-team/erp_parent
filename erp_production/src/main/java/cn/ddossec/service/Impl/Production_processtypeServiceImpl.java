package cn.ddossec.service.Impl;

import cn.ddossec.domain.Production_process_design_sheet;
import cn.ddossec.domain.Production_processtype;
import cn.ddossec.mapper.Production_processtypeMapper;
import cn.ddossec.service.Production_processtypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Production_processtypeServiceImpl implements Production_processtypeService {

    @Autowired
    Production_processtypeMapper production_processtypeMapper;


    @Override
    public List<Production_processtype> finfAllProductionProcesstype() {
        return production_processtypeMapper.finfAllProductionProcesstype();
    }

    @Override
    public int delProductionPprocesstypeById(Integer id) {
        return production_processtypeMapper.delProductionPprocesstypeById(id);
    }

    @Override
    public void insertProductionProcesstype(Production_processtype production_processtype) {
        production_processtypeMapper.insertProductionProcesstype(production_processtype);
    }

    @Override
    public boolean updateProductionProcesstype(Production_processtype production_processtype) {
        return production_processtypeMapper.updateProductionProcesstype(production_processtype);
    }

    @Override
    public Production_process_design_sheet selectById(Integer id) {
        return production_processtypeMapper.selectById(id);
    }
}
