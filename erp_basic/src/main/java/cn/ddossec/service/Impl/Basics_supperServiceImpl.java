package cn.ddossec.service.Impl;

import cn.ddossec.domain.Basics_supper;
import cn.ddossec.mapper.Basics_supperMapper;
import cn.ddossec.mapper.GoodsMapper;
import cn.ddossec.service.Basics_supperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class Basics_supperServiceImpl implements Basics_supperService {

    @Autowired
    Basics_supperMapper basics_supperMapper;

    @Autowired
    GoodsMapper goodsMapper;

    @Override
    public List<Basics_supper> findAll() {
        return basics_supperMapper.findAll();

    }

    @Override
    public List<Basics_supper> findAllBasics_supper(Integer page, Integer rows) {

        page = (page-1)*rows;
        return basics_supperMapper.findAllBasics_supper(page,rows);
    }

    @Override
    public int sellCount() {
        return basics_supperMapper.sellCount();
    }

    @Transactional
    public void delBasics_supperMapperById(Integer id) {

         basics_supperMapper.delBasics_supperMapperById(id);
        goodsMapper.delsId(id);

    }

    @Override
    public void deleteIds(String params) {
        basics_supperMapper.deleteIds(params);
    }

    @Override
    public void insertBasics_supper(Basics_supper basics_supper) {
        basics_supperMapper.insertBasics_supper(basics_supper);
    }

    @Override
    public List<Basics_supper> sellName(String name,Integer page,Integer rows) {
        page = (page-1)*rows;
        return basics_supperMapper.sellName(name,page,rows);
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
