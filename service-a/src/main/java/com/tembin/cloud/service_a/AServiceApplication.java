package com.tembin.cloud.service_a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Tlsy1
 * @since 2018-10-30 18:12
 **/
@EnableHystrix
@SpringBootApplication(scanBasePackages = {"com.tembin.cloud"})
@EnableDiscoveryClient
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.tembin.cloud.service_b.api"})
public class AServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(AServiceApplication.class, args);
    }
}
