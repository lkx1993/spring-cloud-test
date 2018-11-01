package com.tembin.cloud.service_b.api.hystrix;

import com.tembin.cloud.service_b.api.BService;
import org.springframework.stereotype.Component;

/**
 * @author Tlsy1
 * @since 2018-10-30 17:51
 **/
@Component
public class BServiceHystrix implements BService {
    @Override
    public String message() {
        return "sdsafdsedfgggg";
    }

    @Override
    public String traceMessage() {
        return "21312312";
    }
}
