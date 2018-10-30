package com.tembin.cloud.service_b.impl;

import com.tembin.cloud.service_b.api.BService;
import com.tembin.cloud.service_c.api.CService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tlsy1
 * @since 2018-10-30 18:07
 **/
@RestController
public class BServiceImpl implements BService {
    @Value("${message}")
    private String message;
    @Autowired
    private CService cService;

    @Override
    public String message() {
        return message;
    }

    @Override
    public String traceMessage() {
        return cService.message();
    }
}
