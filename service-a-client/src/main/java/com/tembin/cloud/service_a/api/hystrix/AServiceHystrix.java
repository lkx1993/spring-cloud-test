package com.tembin.cloud.service_a.api.hystrix;

import com.tembin.cloud.service_a.api.AService;
import org.springframework.stereotype.Component;

/**
 * @author Tlsy1
 * @since 2018-10-30 17:37
 **/
@Component
public class AServiceHystrix implements AService {
    @Override
    public String message() {
        return null;
    }

    @Override
    public String traceMessage() {
        return null;
    }

    @Override
    public void logTest() {

    }
}
