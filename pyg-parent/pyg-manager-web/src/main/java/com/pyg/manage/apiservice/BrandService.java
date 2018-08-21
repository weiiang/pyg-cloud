package com.pyg.manage.apiservice;

import java.util.List;
import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.baomidou.mybatisplus.plugins.Page;
import com.pyg.entity.Result;
import com.pyg.entity.TbBrand;
import com.pyg.manage.apiservice.hystric.BrandServiceHystric;

@FeignClient(value = "GOODS-SERVICE", fallback = BrandServiceHystric.class)
public interface BrandService {
	
	@RequestMapping("/brand/page")
	public Page<Map<String, Object>> page(@RequestParam(value = "params") Map<String, Object> params);
	
	@RequestMapping("/brand/info")
	public Result getInfo(@RequestParam(value = "id") long id, @RequestParam("type")int type);
	
	@PostMapping("/brand/edit")
	public Result edit(@RequestBody TbBrand brand);
	
	@DeleteMapping("/brand/del")
	public Result delete(@RequestParam("ids")List<Long> ids);
	
	

}
