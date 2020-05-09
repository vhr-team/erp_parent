package cn.ddossec.service.Impl;

import cn.ddossec.domain.Process_design;
import cn.ddossec.mapper.Process_design_Mapper;
import cn.ddossec.service.Process_design_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import cn.ddossec.service.Process_design_Service;

import java.util.List;

@Service
public class Process_design_ServiceImpl implements Process_design_Service {


    @Autowired
    private Process_design_Mapper mapper;


    @Override
    public List<Process_design> findAll() {
        return mapper.findAll();
    }

    @Override
    public void insertProcess_design(Process_design process_design) {
        mapper.insertProcess_design(process_design);
    }
}
