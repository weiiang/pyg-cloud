package com.pyg.manage.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.plugins.Page;
import com.pyg.base.controller.BaseController;
import com.pyg.entity.TbBrand;
import com.pyg.entity.TbBrandExample;
import com.pyg.service.BrandService;

@RestController
@RequestMapping("/brand")
public class BrandController extends BaseController{
	
	private Logger logger = LoggerFactory.getLogger(BrandController.class);

	@Autowired
	private BrandService brandService;
	
	@RequestMapping("/list")
	public Page<TbBrand> list(TbBrandExample brandExample){
		return brandService.pageList(brandExample);
	}
	
	@RequestMapping("/page")
	public Page<Map<String, Object>> page(){
		logger.info("provider--->queryMap[ "+this.getParams().toString()+" ]");
		return brandService.getPage(this.getParams());
	}
}

