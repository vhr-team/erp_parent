package cn.ddoesc.production.service.Impl;

import cn.ddoesc.production.mapper.production_ordermapper;
import cn.ddoesc.production.pojo.production_order;
import cn.ddoesc.production.pojo.production_orderQuery;
import cn.ddoesc.production.service.productionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author joker_dj
 * @create 2020-05-25日 3:15
 */
@Service
@Transactional
public class productionServiceImpl implements productionService {
    @Autowired
    production_ordermapper mapper;
    @Override
    public void addproductionOrder(production_order order) {
        order.setCheckedAudit("等待审核");
        mapper.insertSelective(order);
    }

    @Override
    public void updatecheck(production_order order) {
        production_orderQuery query = new production_orderQuery();
        production_orderQuery.Criteria criteria = query.createCriteria();
        criteria.andScheduleIdEqualTo(order.getScheduleId());
        mapper.updateByExampleSelective(order,query);
    }

    @Override
    public List<production_order> selectOrderList(production_order order) {
        production_orderQuery query = new production_orderQuery();
        production_orderQuery.Criteria criteria = query.createCriteria();
        criteria.andProductionGenerateEqualTo("已生成");
        criteria.andCheckedAuditEqualTo("审核通过");
        return mapper.selectByExample(query);
    }

    /**
     * 制定派送人
     * @param order
     */
    @Override
    public void updateplanperson(production_order order) {
        order.setAddStatus("等待审核");
        production_orderQuery query = new production_orderQuery();
        production_orderQuery.Criteria criteria = query.createCriteria();
        criteria.andScheduleIdEqualTo(order.getScheduleId());
        mapper.updateByExampleSelective(order,query);
    }

    @Override
    public List<production_order> selectcheck() {
        production_orderQuery query = new production_orderQuery();
        production_orderQuery.Criteria criteria = query.createCriteria();
        criteria.andAddStatusEqualTo("等待审核");
        criteria.andCheckedAuditEqualTo("审核通过");
        return mapper.selectByExample(query);
    }

    @Override
    public void updatecheckperson(production_order order) {
        production_orderQuery query = new production_orderQuery();
        production_orderQuery.Criteria criteria = query.createCriteria();
        criteria.andScheduleIdEqualTo(order.getScheduleId());
        order.setAddStatus("审核通过");
        mapper.updateByExampleSelective(order,query);
    }

    @Override
    public List<production_order> selectList() {
        production_orderQuery query = new production_orderQuery();
        production_orderQuery.Criteria criteria = query.createCriteria();
        criteria.andProductionGenerateEqualTo("已生成");
        return mapper.selectByExample(query);
    }
}
