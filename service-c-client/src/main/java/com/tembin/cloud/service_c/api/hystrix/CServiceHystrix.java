package com.tembin.cloud.service_c.api.hystrix;

import com.tembin.cloud.service_c.api.CService;
import org.springframework.stereotype.Component;

/**
 * @author Tlsy1
 * @since 2018-10-30 20:47
 **/
@Component
public class CServiceHystrix implements CService {
    @Override
    public String message() {
        return "asdfasfasd";
    }
}
