package com.pyg.manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.plugins.Page;
import com.pyg.entity.TbBrand;
import com.pyg.entity.TbBrandExample;
import com.pyg.service.BrandService;

@RestController
@RequestMapping("/brand")
public class BrandController {

	@Autowired
	private BrandService brandService;
	
	@RequestMapping("/list")
	public Page<TbBrand> list(TbBrandExample brandExample){
		return brandService.pageList(brandExample);
	}
}

