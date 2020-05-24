package cn.ddoesc.production.service.feign;

import cn.ddossec.domain.pojo.product_design_record;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author joker_dj
 * @create 2020-05-25日 2:23
 */
@FeignClient(name = "design-provider")
public interface designService {
    /*查询档案审核通过且生产未成功档案*/
    @RequestMapping("/design_record/selectplancheck")
    List<product_design_record> selectcheckplanAll();

    /*修改生产状态*/
    @RequestMapping("/updateplancheck")
    void updatePlancheck(@RequestBody product_design_record record);
}
