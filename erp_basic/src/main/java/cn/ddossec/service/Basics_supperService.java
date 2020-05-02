package cn.ddossec.service;

import cn.ddossec.domain.Basics_supper;
import io.swagger.models.auth.In;

import java.util.List;

/*
 * 供货商service接口
 */

public interface Basics_supperService {

    public List<Basics_supper> findAll();
    /*查询所有供货商**/
    public List<Basics_supper> findAllBasics_supper(Integer page, Integer rows);
    /*查询多少供应商*/
    public int sellCount();
    /*根据id 删除供应商的时候 同时删除供应商下的商品**/
    public void delBasics_supperMapperById(Integer id);
    /* 批量删除*/
    public void deleteIds(String params);
    /*添加**/
    public void insertBasics_supper(Basics_supper basics_supper);
    /*根据供应商名称查询**/
    public List<Basics_supper> sellName(String  name,Integer page,Integer rows);
    /*修改**/
    public boolean updateBasics_supper(Basics_supper basics_supper);

    /*根据id查询再修改**/
    public Basics_supper selectById(Integer id);



}
