package com.wq.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
@EnableCaching
@EnableSwagger2
public class CacheApp {
	
	public static void main(String[] args) {
		SpringApplication.run(CacheApp.class, args);
	}

}
