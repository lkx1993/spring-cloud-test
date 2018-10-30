package com.tembin.cloud.service_a.impl;

import com.tembin.cloud.service_a.api.AService;
import com.tembin.cloud.service_b.api.BService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tlsy1
 * @since 2018-10-30 17:59
 **/
@RestController
public class AServiceImpl implements AService {
    @Value("${message}")
    private String message;
    @Autowired
    private BService bService;
    @Override
    public String message() {
        return message;
    }

    @Override
    public String traceMessage() {
        return bService.traceMessage();
    }
}
