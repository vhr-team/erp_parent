package cn.ddossec.controller;

import cn.ddossec.common.DataGridView;
import cn.ddossec.service.GoodsService;
import cn.ddossec.vo.GoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 30315
 * @title: GoodsController
 * @projectName erp_parent
 * @description: TODO
 * @date 2020-04-2410:18
 */
@RequestMapping("goods")
@RestController
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    /**
     * 查询所有商品，可以带查询条件
     *
     * @param goodsVo
     * @return
     */
    @GetMapping("queryAllGoods")
    public DataGridView queryAllGoods(GoodsVo goodsVo) {
        return this.goodsService.queryAllGoods(goodsVo);
    }

}
