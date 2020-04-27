package cn.ddossec.service.feign;

import cn.ddossec.domain.Basics_supper;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "consumption-basic")
public interface BasicsSupperFeign {

    /**
     * 查询全部供应商
     * @return
     */
    @RequestMapping("/supper/getAllSupper")
    public List<Basics_supper> getAllSupper();

}