package cn.ddossec.mapper;

import cn.ddossec.domain.Production_process_design_sheet;
import cn.ddossec.domain.Production_processtype;

import java.util.List;

public interface Production_processtypeMapper {

    public List<Production_processtype> finfAllProductionProcesstype();

    public int delProductionPprocesstypeById(Integer id);

    public void insertProductionProcesstype(Production_processtype production_processtype);

    public boolean updateProductionProcesstype(Production_processtype production_processtype);

    public Production_process_design_sheet selectById(Integer id);
}
