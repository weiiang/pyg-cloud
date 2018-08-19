package com.pyg.manage.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.plugins.Page;
import com.pyg.base.controller.BaseController;
import com.pyg.entity.Result;
import com.pyg.entity.TbBrand;
import com.pyg.entity.TbBrandExample;
import com.pyg.service.BrandService;

@RestController
@RequestMapping("/brand")
public class BrandController extends BaseController{
	
	private Logger logger = LoggerFactory.getLogger(BrandController.class);

	@Autowired
	private BrandService brandService;
	
	@GetMapping("/list")
	public Page<TbBrand> list(TbBrandExample brandExample){
		return brandService.pageList(brandExample);
	}
	
	@GetMapping("/page")
	public Page<Map<String, Object>> page(){
		logger.info("provider--->queryMap[ "+this.getParams().toString()+" ]");
		return brandService.getPage(this.getParams());
	}
	
	
	@GetMapping("/info")
	public Result getInfo(int type, long id){
		Result result = null;
		try {
			result = Result.success(brandService.getInfo(type, id));
			return result;
		} catch (Exception e) {
			result  = Result.failure(500, e.getMessage(), null);
			logger.error("根据ID查询品牌信息失败<--->result:"+result.toString());
			return result;
		}
	}
	
	@PostMapping("/edit")
	public Result edit(TbBrand tbBrand) {
		try {
			Map<String, Object> returnMap = brandService.edit(tbBrand);
			return Result.success(returnMap);
		} catch (Exception e) {
			Result result = Result.failure(500, e.getMessage(), null);
			logger.error("修改品牌信息失败<--->result:"+result.toString());
			return result;
		}
		
	}
}

