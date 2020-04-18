package cn.ddossec.controller;

import cn.ddossec.domain.CkStock;
import cn.ddossec.service.CkStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



/**
 * (CkStock)表控制层
 *
 * @author makejava
 * @since 2020-04-17 18:19:59
 */
@RestController
@RequestMapping("ckStock")
public class CkStockController {
    /**
     * 服务对象
     */
    @Autowired
    private CkStockService ckStockServiceImpl;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public CkStock selectOne(Integer id) {
        return this.ckStockServiceImpl.queryById(id);
    }

}