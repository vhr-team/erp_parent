package cn.ddosec.production.service.feign;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author joker_dj
 * @create 2020-05-12日 10:07
 */
@FeignClient(name="design-provider")
public interface designService {

    public Object selectAll();
}
