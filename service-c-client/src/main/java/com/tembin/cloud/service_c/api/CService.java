package com.tembin.cloud.service_c.api;

import com.tembin.cloud.service_c.api.hystrix.CServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Tlsy1
 * @since 2018-10-30 20:39
 **/
@FeignClient(value = "service-C",fallback = CServiceHystrix.class)
public interface CService {

    @GetMapping("message")
     String message();
}
