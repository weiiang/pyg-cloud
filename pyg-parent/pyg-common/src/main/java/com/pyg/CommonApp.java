package com.pyg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pyg.cache.redis.RedisUtil;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
@EnableCaching
@ComponentScan(basePackages = {"com.pyg"})
@Controller
public class CommonApp {
	
	public static void main(String[] args) {
		SpringApplication.run(CommonApp.class, args);
	}
	
	
	@RequestMapping("/test-cache")
	public String testCache(){
		RedisUtil util = new RedisUtil();
		util.set("a", "a");
		return (String) util.get("a");
	}
	

}
