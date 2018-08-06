package com.pyg.manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pyg.entity.TbBrand;
import com.pyg.service.BrandService;

@RestController
@RequestMapping("/brand")
public class BrandController {

	@Autowired
	private BrandService brandService;
	
	@RequestMapping("/list")
	public List<TbBrand> list(){
		return brandService.list();
	}
}

