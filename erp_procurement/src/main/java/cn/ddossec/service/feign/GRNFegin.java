package cn.ddossec.service.feign;

import cn.ddossec.domain.WarehouseInbound;
import cn.ddossec.domain.pojo.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author joker_dj
 * @create 2020-05-25日 15:47
 */
@FeignClient(value = "warehouse-provider")
public interface GRNFegin {

    @RequestMapping("/warehouseInbound/insertWarehousing")
    public Response insertWarehousing(@RequestBody WarehouseInbound warehouseInbound);

}
