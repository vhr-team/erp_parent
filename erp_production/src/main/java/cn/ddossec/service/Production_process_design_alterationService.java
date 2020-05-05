package cn.ddossec.service;

import cn.ddossec.domain.Production_process_design_alteration;
import cn.ddossec.domain.Production_process_design_sheet;

import java.util.List;

public interface Production_process_design_alterationService {

    public List<Production_process_design_alteration> findAllProductionAlteration();

    public int delProductionAlterationById(Integer id);

    public void insertProductionAlteration(Production_process_design_alteration production_process_design_alteration);

    public boolean updateProductionAlteration(Production_process_design_alteration production_process_design_alteration);

    public Production_process_design_alteration selectById(Integer id);
}
