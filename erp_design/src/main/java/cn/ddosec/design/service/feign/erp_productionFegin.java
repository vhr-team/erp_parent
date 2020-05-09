package cn.ddosec.design.service.feign;

import cn.ddosec.design.pojo.Production_mdesign_procedure;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "design-provider")
public interface erp_productionFegin {



    /**
     * 查询所有未审核的产品
     * @return
     */
    @RequestMapping("/production/getAllProduction")
    public String getAllProduction();

    //审核后添加到生产模块
    @RequestMapping(value = "/production/insertProduction2",method = RequestMethod.POST)
    public String insertProduction_mdesign_procedure(@RequestParam("productId") String  productId,@RequestParam("productName") String  productName,@RequestParam("productClass") String  productClass,@RequestParam("register") String  register,@RequestParam("registerTime") String  registerTime,@RequestParam("checker") String  checker);

}
