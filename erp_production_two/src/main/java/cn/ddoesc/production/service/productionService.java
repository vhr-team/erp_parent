package cn.ddoesc.production.service;

import cn.ddoesc.production.mapper.production_ordermapper;
import cn.ddoesc.production.pojo.production_order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author joker_dj
 * @create 2020-05-25日 3:13
 */
@Service
@Transactional
public interface productionService {
    void addproductionOrder(production_order order);
}
