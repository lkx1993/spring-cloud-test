package com.tembin.cloud.auth.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class JwtTokenInterceptor implements RequestInterceptor {
    private Logger logger = LoggerFactory.getLogger(JwtTokenInterceptor.class);

    @Autowired
    private com.tembin.cloud.auth.utils.JwtGenerator jwtGenerator;

    @Override
    public void apply(RequestTemplate requestTemplate) {
        try {
            requestTemplate.header(jwtGenerator.getHeader(),jwtGenerator.getJwtToken() );
        } catch (Exception e) {
            logger.error("{}", e);
        }
    }
}
