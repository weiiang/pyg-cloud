package com.pyg.manage.apiservice;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.pyg.manage.apiservice.hystric.BrandServiceHystric;

@FeignClient(value = "GOODS-SERVICE", fallback = BrandServiceHystric.class)
public interface BrandService {
	
	

}
