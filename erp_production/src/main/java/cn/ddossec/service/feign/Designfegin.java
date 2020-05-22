package cn.ddossec.service.feign;

import cn.ddossec.entity.PageResult;
import cn.ddossec.domain.pojo.product_design_record;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "design-provider")
public interface Designfegin {

    /**
     * 查询所有物料
     * @return
     */
    @RequestMapping("/design_material/selectAll")
    public Object selectAll();
    /**
     * 查询通过审核的档案
     * @return
     */
    @RequestMapping("/design_record/selectprocessAlls")
    public List<product_design_record> selectprocessAll();


    /**
     * 分页查询
     * @param page
     * @param pageSize
     * @return
     */
    @RequestMapping("/design_record/findPage")
    PageResult findPage(@RequestParam Integer page, @RequestParam Integer pageSize);







}
