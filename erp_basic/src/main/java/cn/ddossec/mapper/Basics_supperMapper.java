package cn.ddossec.mapper;

import cn.ddossec.domain.Basics_supper;

import java.util.List;

/*
 * 供货商mapper
 */

public interface Basics_supperMapper {

    /*查询所有供货商**/
    public List<Basics_supper> findAllBasics_supper();

    /*根据id删除**/
    public int delBasics_supperMapperById(Integer id);

    /*添加**/
    public void insertBasics_supper(Basics_supper basics_supper);

    /*修改**/
    public boolean updateBasics_supper(Basics_supper basics_supper);

    /*根据id查询再修改**/
    public Basics_supper selectById(Integer id);

}
