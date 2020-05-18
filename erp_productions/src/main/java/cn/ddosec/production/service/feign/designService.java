package cn.ddosec.production.service.feign;

import cn.ddossec.domain.pojo.product_design_material;
import cn.ddossec.domain.pojo.product_design_record;
import cn.ddossec.domain.pojo.product_material_archives;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author joker_dj
 * @create 2020-05-12日 10:07
 */
@FeignClient(name = "design-provider")
public interface designService {
    /**
     * 查询通过审核的档案
     * @return
     */
    @RequestMapping("/design_record/selectprocessAll")
    public List<product_design_record> selectprocessAll(@RequestBody product_design_record record);

    /**
     * 根据产品id查询物料
     */@RequestMapping("/material_archives/selectByproId")
    public List<product_material_archives> selectByproId(@RequestParam String productId);

     @RequestMapping("/design_record/updateprocess")
     public void updatecheck(@RequestBody product_design_record record);

}
