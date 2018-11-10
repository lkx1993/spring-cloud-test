package com.tembin.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableConfigServer
//@EnableDiscoveryClient //todo 不使用这个注解,也可以关联到admin-server中,为啥呢
@EnableEurekaClient  //todo 如何把config-server弄到eureka中呢
@EnableAutoConfiguration
public class ConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigApplication.class, args);
	}
}
