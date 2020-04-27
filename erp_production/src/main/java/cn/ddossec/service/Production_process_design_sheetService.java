package cn.ddossec.service;

import cn.ddossec.domain.Product_designprocess;
import cn.ddossec.domain.Production_process_design_sheet;

import java.util.List;

public interface Production_process_design_sheetService {

    public List<Production_process_design_sheet> findAll();

    public void addProduction_process_design_sheet(Production_process_design_sheet production_process_design_sheet, Integer prdouctId, List<Product_designprocess> product_designprocessesLis);



}
