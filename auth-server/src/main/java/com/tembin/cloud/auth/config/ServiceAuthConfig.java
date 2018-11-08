package com.tembin.cloud.auth.config;

import com.tembin.cloud.auth.filter.ServiceAuthFilter;
import com.tembin.cloud.auth.utils.JwtAuthenticator;
import com.tembin.cloud.auth.utils.JwtGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tlsy1
 * @since 2018-11-08 19:29
 **/
@Configuration
public class ServiceAuthConfig {

    @Bean
    public FilterRegistrationBean UpdateUserFilterProxy(@Autowired JwtAuthenticator jwtAuthenticator, @Autowired JwtGenerator jwtGenerator){
        ServiceAuthFilter serviceAuthFilter=new ServiceAuthFilter(jwtGenerator,jwtAuthenticator);
        FilterRegistrationBean registrationBean=new FilterRegistrationBean();
        registrationBean.setFilter(serviceAuthFilter);
        List<String> urlPatterns=new ArrayList<String>();
        urlPatterns.add("/*");//拦截路径，可以添加多个
        registrationBean.setUrlPatterns(urlPatterns);
        registrationBean.setOrder(1);
        return registrationBean;
    }
}
