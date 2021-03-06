package com.tembin.cloud.service_c;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author Tlsy1
 * @since 2018-10-30 18:12
 **/
@EnableHystrix
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class CServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(CServiceApplication.class, args);
    }
}
