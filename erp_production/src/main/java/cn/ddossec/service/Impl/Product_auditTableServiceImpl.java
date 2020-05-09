package cn.ddossec.service.Impl;

import cn.ddossec.domain.Process_design;
import cn.ddossec.domain.Product_auditTable;
import cn.ddossec.mapper.Process_design_Mapper;
import cn.ddossec.mapper.Product_auditTableMapper;
import cn.ddossec.mapper.Production_process_design_sheetMapper;
import cn.ddossec.service.Product_auditTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Random;
import java.util.UUID;

@Service
public class Product_auditTableServiceImpl implements Product_auditTableService {

    @Autowired
    private Product_auditTableMapper product_auditTableMapper;
    @Autowired
    private Production_process_design_sheetMapper production_process_design_sheetMapper;
    @Autowired
    private Process_design_Mapper process_design_mapper;

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
    public void auditSjdShb(String shState, String audit_date, Integer sjdId, Integer shdId,String product_name,String product_designer,String procedure_id,String auditor_name) {
        product_auditTableMapper.updatePeoduct_audit(shState,sjdId);

        production_process_design_sheetMapper.updateProduction_process(audit_date,shdId);
        Process_design process_design = new Process_design(0,getOrderIdByUUId(),product_name,procedure_id,product_designer,audit_date,null,auditor_name);
        process_design_mapper.insertProcess_design(process_design);
    }
    public static String getOrderIdByUUId() {
        int first = new Random(10).nextInt(8) + 1;
        int hashCodeV = UUID.randomUUID().toString().hashCode();
        if (hashCodeV < 0) {//有可能是负数
            hashCodeV = -hashCodeV;
        }
        // 0 代表前面补充0
        // 4 代表长度为4
        // d 代表参数为正数型
        return first + String.format("%015d", hashCodeV);
    }
}
