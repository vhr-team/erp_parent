package cn.ddossec.controller;

import cn.ddossec.common.Constant;
import cn.ddossec.common.DataGridView;
import cn.ddossec.common.ResultObj;
import cn.ddossec.domain.Goods;
import cn.ddossec.service.GoodsService;
import cn.ddossec.vo.GoodsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    /**
     * 添加商品
     *
     * @param goods
     * @return
     */
    @PostMapping("addGoods")
    public ResultObj addGoods(@RequestBody Goods goods) {
        try {
            goods.setAvailable(Constant.AVAILABLE_TRUE);
            this.goodsService.save(goods);
            return ResultObj.ADD_SUCCESS;
        } catch (Exception e) {
            return ResultObj.ADD_ERROR;
        }
    }

    /**
     * 修改商品
     *
     * @return
     */
    @PostMapping("updateGoods")
    public ResultObj updateGoods(@RequestBody Goods goods) {
        try {
            this.goodsService.updateById(goods);
            return ResultObj.UPDATE_SUCCESS;
        } catch (Exception e) {
            return ResultObj.UPDATE_ERROR;
        }
    }

    /**
     * 删除商品
     *
     * @param id
     * @return
     */
    @GetMapping("deleteGoods")
    public ResultObj deleteGoods(Integer id) {
        try {
            this.goodsService.removeById(id);
            return ResultObj.DELETE_SUCCESS;
        } catch (Exception e) {
            return ResultObj.DELETE_ERROR;
        }
    }

    @GetMapping("queryGoodsById")
    public Goods queryGoodsById(@RequestParam Integer product_id) {
        return this.goodsService.getById(product_id);
    }

    /**
     * 根据商品类别ID，查询商品
     * @param producttypeid
     * @return
     */
    @GetMapping("queryGoodsByProductTypeId")
    public Object queryGoodsByProductTypeId(Integer producttypeid){
        return this.goodsService.queryGoodsByProductTypeId(producttypeid);
    }
}