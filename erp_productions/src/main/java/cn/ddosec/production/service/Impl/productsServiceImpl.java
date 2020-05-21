package cn.ddosec.production.service.Impl;

import cn.ddosec.production.mapper.products_process_design_sheetmapper;
import cn.ddosec.production.pojo.products_process_design_sheet;
import cn.ddosec.production.pojo.products_process_design_sheetQuery;
import cn.ddosec.production.service.productsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author joker_dj
 * @create 2020-05-17日 17:42
 */
@Service
@Transactional
public class productsServiceImpl implements productsService {
    @Autowired
    products_process_design_sheetmapper mapper;
    @Override
    public void addsheet(products_process_design_sheet sheet) {
        mapper.insertSelective(sheet);
    }

    @Override
    public List<products_process_design_sheet> selectAllSheet(products_process_design_sheet sheet) {
        products_process_design_sheetQuery query = new products_process_design_sheetQuery();
        products_process_design_sheetQuery.Criteria criteria = query.createCriteria();
        criteria.andProcessIdEqualTo(sheet.getProcessId());
        List<products_process_design_sheet> products_process_design_sheets = mapper.selectByExample(query);
        return products_process_design_sheets;
    }

    @Override
    public void updatecheck(products_process_design_sheet sheet) {
        products_process_design_sheetQuery query = new products_process_design_sheetQuery();
        products_process_design_sheetQuery.Criteria criteria = query.createCriteria();
        criteria.andProcessIdEqualTo(sheet.getProcessId());
        mapper.updateByExampleSelective(sheet,query);
    }

    @Override
    public List<products_process_design_sheet> selectprocessById(String processId) {
        products_process_design_sheetQuery query = new products_process_design_sheetQuery();
        products_process_design_sheetQuery.Criteria criteria = query.createCriteria();
        criteria.andProcessIdEqualTo(processId);
        List<products_process_design_sheet> products_process_design_sheets = mapper.selectByExample(query);
        return products_process_design_sheets;
    }

    @Override
    public void deleteByprocessId(String processId) {
        products_process_design_sheetQuery query = new products_process_design_sheetQuery();
        products_process_design_sheetQuery.Criteria criteria = query.createCriteria();
        criteria.andProcessIdEqualTo(processId);
        mapper.deleteByExample(query);
    }


}
