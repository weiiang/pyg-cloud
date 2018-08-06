package com.pyg.manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.pyg.consts.AppConsts;
import com.pyg.entity.TbBrand;

@RestController
@RequestMapping("/brand")
public class BrandController {

	@Autowired
	private RestTemplate template;
	
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/list")
	public List<TbBrand> list(){
		return template.getForObject(AppConsts.MANAGE_SERVICE_URL+"/brand/list", List.class);
	}
	
	
}
