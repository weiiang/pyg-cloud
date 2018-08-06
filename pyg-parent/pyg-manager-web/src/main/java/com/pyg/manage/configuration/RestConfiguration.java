package com.pyg.manage.configuration;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestConfiguration {
	
	@Bean
	@LoadBalanced//必须要加负载均衡注解才能完成用服务名称调用 服务
	public RestTemplate getTemplate() {
		return new RestTemplate();
	}

}
