package com.tembin.cloud.service_b.api;

import com.tembin.cloud.service_b.api.hystrix.BServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Tlsy1
 * @since 2018-10-30 17:48
 **/
@FeignClient(value = "service-B",fallback = BServiceHystrix.class)
public interface BService {
    @GetMapping("message")
    String message();

    @GetMapping("trace-message")
    String traceMessage();
}
