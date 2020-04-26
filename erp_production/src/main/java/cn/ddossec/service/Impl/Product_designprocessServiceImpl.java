package cn.ddossec.service.Impl;

import cn.ddossec.domain.Product_designprocess;
import cn.ddossec.mapper.Product_designprocessMapper;
import cn.ddossec.service.Product_designprocessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("Product_designprocessService")
public class Product_designprocessServiceImpl implements Product_designprocessService {

    @Autowired
   private   Product_designprocessMapper product_designprocessMapper;
    @Override
    public List<Product_designprocess> findAllProduction_modesign_procedure() {
        return product_designprocessMapper.findAllProduction_modesign_procedure();
    }

    @Override
    public int insertProduction_modesign_procedure( Product_designprocess product_designprocess) {
        return product_designprocessMapper.insertProduction_modesign_procedure(product_designprocess);
    }
}
