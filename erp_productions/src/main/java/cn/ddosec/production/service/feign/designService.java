package cn.ddosec.production.service.feign;

import cn.ddossec.domain.pojo.product_design_record;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author joker_dj
 * @create 2020-05-12日 10:07
 */
@FeignClient(name = "design-provider")
public interface designService {
    @RequestMapping("/design_record/selectById")
    public Object selectById(@RequestParam Integer Id);

    /**
     * 查询通过审核的档案
     * @return
     */
    @RequestMapping("/design_record/selectcheckAll")
    public List<product_design_record> selectcheckAll();
}
