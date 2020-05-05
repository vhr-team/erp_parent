package cn.ddossec.service.Impl;

import cn.ddossec.domain.Product_designprocess;
import cn.ddossec.domain.Production_mdesign_procedure;
import cn.ddossec.domain.Production_process_design_alteration;
import cn.ddossec.domain.Production_process_design_sheet;
import cn.ddossec.mapper.Product_designprocessMapper;
import cn.ddossec.mapper.Production_process_design_alterationMapper;
import cn.ddossec.service.Product_designprocessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service("Product_designprocessService")
public class Product_designprocessServiceImpl implements Product_designprocessService {

    @Autowired
   private   Product_designprocessMapper product_designprocessMapper;

    @Autowired
    private Production_process_design_alterationMapper production_process_design_alterationMapper;

    @Override
    public List<Product_designprocess> findAllProduction_modesign_procedure() {
        return product_designprocessMapper.findAllProduction_modesign_procedure();
    }

    @Override
    public List<Product_designprocess> findDId(String design_id) {
        return product_designprocessMapper.findDId(design_id);
    }

    @Transactional
    public void updateProduct_designprocess(List<Product_designprocess> product_designprocessesLis ,Integer sjdId ,Integer shdId,String edie_date,String userName) {
        float zcbPrice =0 ;
        for (Product_designprocess product_designprocessesLi : product_designprocessesLis) {
            float sveePurchasingPrice  = (  product_designprocessesLi.getProcess_time_gs()*product_designprocessesLi.getProcess_time_cost());

            product_designprocessesLi.setProcess_subtotal(sveePurchasingPrice);
            System.out.println("循环"+sveePurchasingPrice);
            zcbPrice = zcbPrice+sveePurchasingPrice;
            product_designprocessMapper.updateByid(product_designprocessesLi);
            System.out.println(product_designprocessesLi);

        }
        Production_process_design_alteration Production_process_design_alteration2 = production_process_design_alterationMapper.selectById(shdId);
        if (Production_process_design_alteration2.getShdId()!=null){
            float count =1 ;
            Production_process_design_alteration Production_process_design_alteration3 = new Production_process_design_alteration(Production_process_design_alteration2.getId(),Production_process_design_alteration2.getSjdId(),Production_process_design_alteration2.getShdId(),Production_process_design_alteration2.getEdit_date(),Production_process_design_alteration2.getEdit_count()+1,Production_process_design_alteration2.getUserName());
            production_process_design_alterationMapper.updateProductionAlteration(Production_process_design_alteration3);
            return;
        }
        Production_process_design_alteration p1 = new Production_process_design_alteration(0,sjdId,shdId,edie_date,0,userName);

        production_process_design_alterationMapper.insertProductionAlteration(p1);
    }


    @Override
    public int insertProduction_modesign_procedure( Product_designprocess product_designprocess) {
        return product_designprocessMapper.insertProduction_modesign_procedure(product_designprocess);
    }
}
