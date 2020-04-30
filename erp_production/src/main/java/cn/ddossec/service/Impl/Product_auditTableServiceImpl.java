package cn.ddossec.service.Impl;

import cn.ddossec.domain.Product_auditTable;
import cn.ddossec.mapper.Product_auditTableMapper;
import cn.ddossec.mapper.Production_process_design_sheetMapper;
import cn.ddossec.service.Product_auditTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class Product_auditTableServiceImpl implements Product_auditTableService {

    @Autowired
    private Product_auditTableMapper product_auditTableMapper;
    @Autowired
    private Production_process_design_sheetMapper production_process_design_sheetMapper;

    @Override
    public List<Product_auditTable> IsfindAllProduct_auditTable() {
        return product_auditTableMapper.IsfindAllProduct_auditTable();
    }

    @Override
    public List<Product_auditTable> findAllProduct_auditTable() {
        return product_auditTableMapper.findAllProduct_auditTable();
    }

    @Override
    public void insertProduct_auditTable() {

    }

    @Transactional
    public void auditSjdShb(String shState, String audit_date, Integer sjdId, Integer shdId) {
        product_auditTableMapper.updatePeoduct_audit(shState,sjdId);

        production_process_design_sheetMapper.updateProduction_process(audit_date,shdId);
    }
}
