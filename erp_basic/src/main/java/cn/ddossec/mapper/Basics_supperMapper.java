package cn.ddossec.mapper;

import cn.ddossec.domain.Basics_supper;

import java.util.List;

/*
 * 供货商mapper
 */

public interface Basics_supperMapper {

    /*查询所有供货商**/
    public List<Basics_supper> findAllBasics_supper(Integer page, Integer rows);

    public List<Basics_supper> findAll();

    /*根据供应商名称查询**/
    public List<Basics_supper> sellName(String name, Integer page, Integer rows);

    /*根据id删除供应商**/
    public int delBasics_supperMapperById(Integer id);

    /*查询供应商多少个*/
    public int sellCount();

    /* 批量删除*/
    public void deleteIds(String params);

    /*添加**/
    public void insertBasics_supper(Basics_supper basics_supper);

    /*修改**/
    public boolean updateBasics_supper(Basics_supper basics_supper);

    /*根据id查询再修改**/
    public Basics_supper selectById(Integer id);






}
