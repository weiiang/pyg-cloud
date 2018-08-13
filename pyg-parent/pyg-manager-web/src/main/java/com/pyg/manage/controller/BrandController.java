package com.pyg.manage.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.baomidou.mybatisplus.plugins.Page;
import com.pyg.consts.AppConsts;
import com.pyg.entity.TbBrand;

@RestController
@RequestMapping("/brand")
public class BrandController	{
	private Logger logger =  LoggerFactory.getLogger(BrandController.class);

	@Autowired
	private RestTemplate template;
	
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/list")
	public Page<TbBrand> list(Page<TbBrand> page){
		logger.info("page=>"+page.getSize()+"string=>"+page.toString());
		return template.getForObject(AppConsts.MANAGE_SERVICE_URL+"/brand/list", Page.class, page);
	}
	
	
}
