package cn.ddossec.service.Impl;

import cn.ddossec.domain.Product_auditTable;
import cn.ddossec.domain.Product_designprocess;
import cn.ddossec.domain.Production_mdesign_procedure;
import cn.ddossec.domain.Production_process_design_sheet;
import cn.ddossec.mapper.Product_auditTableMapper;
import cn.ddossec.mapper.Production_mdesign_procedureMapper;
import cn.ddossec.mapper.Production_process_design_alterationMapper;
import cn.ddossec.mapper.Production_process_design_sheetMapper;
import cn.ddossec.service.Product_designprocessService;
import cn.ddossec.service.Production_process_design_sheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class Production_process_design_sheetServiceImpl implements Production_process_design_sheetService {

    @Autowired
    private   Production_process_design_sheetMapper production_process_design_sheetMapper;

    @Autowired
    private Production_mdesign_procedureMapper production_mdesign_procedureMapper;

    @Autowired
    private Product_designprocessService product_designprocessService;

    @Autowired
    private Product_auditTableMapper product_auditTableMapper;



    @Override
    public List<Production_process_design_sheet> findAll() {
        return production_process_design_sheetMapper.findAll();
    }

    @Transactional
    public void addProduction_process_design_sheet(Production_process_design_sheet production_process_design_sheet, Integer prdouctId, List<Product_designprocess> product_designprocessesLis) {
      Production_mdesign_procedure p1 = new Production_mdesign_procedure(prdouctId,"D002");
        production_process_design_sheetMapper.addProduction_process_design_sheet(production_process_design_sheet);
      production_mdesign_procedureMapper.updateProduction_mdesign_procedure(p1);
        float zcbPrice =0 ;
        for (Product_designprocess product_designprocessesLi : product_designprocessesLis) {
            product_designprocessesLi.setDesign_id(production_process_design_sheet.getDesign_idB());
            float sveePurchasingPrice  = (  product_designprocessesLi.getProcess_time_gs()*product_designprocessesLi.getProcess_time_cost());

            product_designprocessesLi.setProcess_subtotal(sveePurchasingPrice);
            System.out.println("循环"+sveePurchasingPrice);
            zcbPrice = zcbPrice+sveePurchasingPrice;
           product_designprocessService.insertProduction_modesign_procedure(product_designprocessesLi);
            System.out.println(product_designprocessesLi);

        }
        System.out.println("总计"+zcbPrice+"ID"+production_process_design_sheet.getId());
        Product_auditTable table = new Product_auditTable(0,production_process_design_sheet.getId(),"完成","未审核",zcbPrice);
        product_auditTableMapper.insertProduct_auditTable(table);
    }
}
