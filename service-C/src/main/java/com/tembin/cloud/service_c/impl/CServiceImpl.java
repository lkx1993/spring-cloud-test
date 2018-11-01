package com.tembin.cloud.service_c.impl;

import com.tembin.cloud.service_c.api.CService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tlsy1
 * @since 2018-10-30 20:48
 **/
@RestController
public class CServiceImpl implements CService {

    @Value("${message}")
    private String message;

    @Override
    public String message() {
        return message;
    }
}
