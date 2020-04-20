package cn.ddossec.service.Impl;

import cn.ddossec.domain.Basics_supper;
import cn.ddossec.mapper.Basics_supperMapper;
import cn.ddossec.service.Basics_supperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * 供货商service实现类
 */

@Service
public class Basics_supperServiceImpl implements Basics_supperService {

    @Autowired
    Basics_supperMapper basics_supperMapper;

    @Override
    public List<Basics_supper> findAllBasics_supper() {
        return basics_supperMapper.findAllBasics_supper();
    }
}
