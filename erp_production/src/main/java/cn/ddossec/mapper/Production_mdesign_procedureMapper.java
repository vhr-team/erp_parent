package cn.ddossec.mapper;

import cn.ddossec.domain.Production_mdesign_procedure;

import java.util.List;

public interface Production_mdesign_procedureMapper {

    /*查询所有数据  没有设计单的产品**/
    public List<Production_mdesign_procedure> findAllProduction_mdesign_procedure();

    /*查询所有数据  有设计单的产品 待审核的**/
    public List<Production_mdesign_procedure> findAllProduction_mdesign_procedure_sh();



    /*根据id删除**/
    public int delProduction_mdesign_procedureById(Integer id);

    /*添加**/
    public void insertProduction_mdesign_procedure(Production_mdesign_procedure procedure);

    /*修改**/
    public boolean updateProduction_mdesign_procedure(Production_mdesign_procedure production_mdesign_procedure);

    /*根据id查询再修改**/
    public Production_mdesign_procedure selectById(Integer id);
}
