package cn.ddoesc.production.controller;

import cn.ddoesc.production.service.feign.designService;
import cn.ddossec.domain.pojo.Response;
import cn.ddossec.domain.pojo.product_design_record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author joker_dj
 * @create 2020-05-25日 2:29
 */
@RestController
@RequestMapping("/Feignprodution")
public class productionController {
    @Autowired
    designService feignservice;

    /**
     * 查询档案审核通过且没有制定生产设计的档案
     * @return
     */
    @RequestMapping("/selectPlancheckAll")
    public List<product_design_record> selectPlancheckAll(){
        return feignservice.selectcheckplanAll();
    }

    public Response updatePlancheck(@RequestBody product_design_record record){
        record.setPlanCheckstatus("已完成");
       try {
          feignservice.updatePlancheck(record);
          return new Response(true,"成功");
       }catch (Exception e){
           e.printStackTrace();
           return new Response(false,"失败");
       }
    }
}
