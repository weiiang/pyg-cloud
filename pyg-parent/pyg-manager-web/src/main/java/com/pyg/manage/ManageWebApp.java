package com.pyg.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@ComponentScan(basePackages = {"com.pyg"})
@RestController
public class ManageWebApp {

	public static void main(String[] args) {
		SpringApplication.run(ManageWebApp.class, args);
	}
	
	@RequestMapping("/hi")
	private String hi(){
		return "success";
	}
	
}
