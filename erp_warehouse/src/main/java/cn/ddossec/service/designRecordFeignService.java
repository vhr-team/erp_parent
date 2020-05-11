package cn.ddossec.service;

import cn.ddosec.design.entity.PageResult;
import cn.ddosec.design.entity.Response;
import cn.ddosec.design.pojo.product_design_record;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 用feign调用设计的微服务
 */
@FeignClient(value = "design-provider")
public interface designRecordFeignService {

    /**
     * 根据产品编号修改安全库存状态
     * @param productId
     * @param InventoryStatus
     * @return
     */
    @RequestMapping("/design_record/updateinventoryStatus")
    Response updateinventoryStatus(@RequestParam("productId") String productId,@RequestParam("InventoryStatus") Integer InventoryStatus);

    /**
     *   根据设计审核通过查询出制定安全库存配置单
     * @param page
     * @param pageSize
     * @param record
     * @return
     */
    @RequestMapping("/design_record/findPagecheck")
    PageResult findPagecheck(@RequestParam("page") Integer page,@RequestParam("pageSize") Integer pageSize, @RequestBody product_design_record record);

}
