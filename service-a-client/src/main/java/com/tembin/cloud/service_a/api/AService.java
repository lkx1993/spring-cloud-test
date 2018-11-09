package com.tembin.cloud.service_a.api;

import com.tembin.cloud.service_a.api.hystrix.AServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Tlsy1
 * @since 2018-10-30 17:32
 **/
@FeignClient(value = "service-A",fallback = AServiceHystrix.class)
public interface AService {

    @GetMapping("message")
    String message();

    @GetMapping("trace-message")
    String traceMessage();

    @GetMapping("log-test")
    void logTest();
}
