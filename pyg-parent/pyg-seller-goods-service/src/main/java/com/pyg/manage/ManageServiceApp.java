package com.pyg.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = {"com.pyg"})
public class ManageServiceApp {

	public static void main(String[] args) {
		SpringApplication.run(ManageServiceApp.class, args);
	}
}
