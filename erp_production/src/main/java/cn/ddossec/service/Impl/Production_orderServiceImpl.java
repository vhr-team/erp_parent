package cn.ddossec.service.Impl;

import cn.ddossec.domain.Production_order;
import cn.ddossec.mapper.Production_orderMapper;
import cn.ddossec.service.Production_orderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class Production_orderServiceImpl implements Production_orderService {


    /**
     * 获取现在时间
     *
     * @return返回字符串格式yyyyMMddHHmmss
     */
    public static String getStringDate() {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
        String dateString = formatter.format(currentTime);
        return dateString;
    }

    /**
     * 由年月日时分秒+3位随机数
     0.     * 生成流水号
     *
     * @return
     */
    public static String Getnum() {
        String t = getStringDate();
        int x = (int) (Math.random() * 900) + 100;
        String serial = t + x;
        return serial;
    }

    @Autowired
    Production_orderMapper production_orderMapper;


    @Override
    public List<Production_order> findAllProductionOrder() {
        return production_orderMapper.findAllProductionOrder();
    }

    @Override
    public void insertProductionOrder(Production_order production_order) {
        production_orderMapper.insertProductionOrder(production_order);
    }

    @Override
    public boolean updateProductionOrder(String id) {
        return production_orderMapper.updateProductionOrder(id);
    }

    @Override
    public Production_order selectById(Integer id) {
        return production_orderMapper.selectById(id);
    }

    @Override
    public List<Production_order> findByProduction_generate() {
        return production_orderMapper.findByProduction_generate();
    }

    @Override
    public boolean updatechecked_audit(String id) {
        return production_orderMapper.updatechecked_audit(id);
    }

    @Override
    public List<Production_order> findByChecked_audit() {
        return production_orderMapper.findByChecked_audit();
    }

    @Override
    public List<Production_order> findByAdd_status() {
        return production_orderMapper.findByAdd_status();
    }

    @Override
    public boolean updateAdd_status(String id) {
        return production_orderMapper.updateAdd_status(id);
    }


}
