package cn.ddossec.service.feign;

import cn.ddossec.domain.ProductType;
import cn.ddossec.domain.Basics_supper;
import cn.ddossec.domain.Goods;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "consumption-basic")
public interface BasicsSupperFeign {

    /**
     * 查询全部供应商
     * @return
     */
    @RequestMapping("/supper/getAllSupper")
    public List<Basics_supper> getAllSupper();

    @GetMapping("/goods/queryGoodsById")
    public Goods queryGoodsById(@RequestParam Integer product_id);

    @GetMapping("/productType/loadAllProductType")
    public List<ProductType> loadAllProductType();
}