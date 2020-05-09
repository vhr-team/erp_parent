package cn.ddossec.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "design-provider")
public interface Designfegin {

    /**
     * 查询所有物料
     * @return
     */
    @RequestMapping("/design_material/selectAll")
    public String selectAll();
}
