package cn.ddossec.service;

import cn.ddossec.domain.Production_process_design_sheet;
import cn.ddossec.domain.Production_processtype;

import java.util.List;

public interface Production_processtypeService {

    public List<Production_processtype> finfAllProductionProcesstype();

    public int delProductionPprocesstypeById(Integer id);

    public void insertProductionProcesstype(Production_processtype production_processtype);

    public boolean updateProductionProcesstype(Production_processtype production_processtype);

    public Production_process_design_sheet selectById(Integer id);
}
