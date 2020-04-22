package cn.ddossec.service.Impl;

import cn.ddossec.domain.Basics_supper;
import cn.ddossec.mapper.Basics_supperMapper;
import cn.ddossec.service.Basics_supperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Basics_supperServiceImpl implements Basics_supperService {

    @Autowired
    Basics_supperMapper basics_supperMapper;

    @Override
    public List<Basics_supper> findAllBasics_supper() {
        return basics_supperMapper.findAllBasics_supper();
    }

    @Override
    public int delBasics_supperMapperById(Integer id) {
        return basics_supperMapper.delBasics_supperMapperById(id);
    }

    @Override
    public void insertBasics_supper(Basics_supper basics_supper) {
        basics_supperMapper.insertBasics_supper(basics_supper);
    }

    @Override
    public boolean updateBasics_supper(Basics_supper basics_supper) {
        return basics_supperMapper.updateBasics_supper(basics_supper);
    }

    @Override
    public Basics_supper selectById(Integer id) {
        return basics_supperMapper.selectById(id);
    }

}
