package cn.ddosec.production.service.Impl;

import cn.ddosec.production.mapper.products_process_designmapper;
import cn.ddosec.production.pojo.products_process_design;
import cn.ddosec.production.pojo.products_process_designQuery;
import cn.ddosec.production.service.processService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author joker_dj
 * @create 2020-05-17日 17:42
 */
@Service
@Transactional(rollbackFor = { Exception.class })
public class processServiceImpl implements processService {
    @Autowired
    products_process_designmapper mapper;
    @Override
    public void addprocess(products_process_design design) {
        mapper.insertSelective(design);
    }

    @Override
    public List<products_process_design> selectAll(products_process_design design) {
        products_process_designQuery query = new products_process_designQuery();
        products_process_designQuery.Criteria criteria = query.createCriteria();
        if(design!=null){
            if (design.getProductName()!=null){
                criteria.andProductNameLike("%"+design.getProductName()+"%");
            }
            if(design.getProcessCheck()!=null){
                criteria.andProcessCheckEqualTo(design.getProcessCheck());
            }
        }
        List<products_process_design> products_process_designs = mapper.selectByExample(query);
        return products_process_designs;
    }

    @Override
    public List<products_process_design> selectcheckAll(products_process_design design) {
        products_process_designQuery query = new products_process_designQuery();
        products_process_designQuery.Criteria criteria = query.createCriteria();
        if(design!=null){
            if (design.getProductName()!=null){
                criteria.andProductNameLike("%"+design.getProductName()+"%");
            }
        }
        List<products_process_design> products_process_designs = mapper.selectByExample(query);
        return products_process_designs;
    }

    @Override
    public void updatecheck(products_process_design design) {
        products_process_designQuery query = new products_process_designQuery();
        products_process_designQuery.Criteria criteria = query.createCriteria();
        criteria.andProcessIdEqualTo(design.getProcessId());
        mapper.updateByExampleSelective(design,query);
    }
}
