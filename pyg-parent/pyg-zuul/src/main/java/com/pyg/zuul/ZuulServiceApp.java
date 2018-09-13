package com.pyg.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 *	@Create  on 	2018年9月11日		下午8:37:49
 *	@Author: Wq
 *	@E-mail: 1432114216@qq.com
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulServiceApp {

	public static void main(String[] args) {
		
		SpringApplication.run(ZuulServiceApp.class, args);
	}

}


