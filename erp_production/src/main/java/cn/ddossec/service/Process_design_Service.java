package cn.ddossec.service;

import cn.ddossec.domain.Process_design;

import java.util.List;

public interface Process_design_Service {

    /**
     * 查询所有没有设计的工序物料
     * @return
     */
    public List<Process_design> findAll();


    /**
     * 添加物料单
     * @return
     */
    public void insertProcess_design(Process_design process_design);
}
