package com.pyg.manage.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.baomidou.mybatisplus.plugins.Page;
import com.pyg.base.controller.BaseController;
import com.pyg.consts.AppConsts;
import com.pyg.entity.TbBrand;
import com.pyg.page.InitPage;

@RestController
@RequestMapping("/brand")
public class BrandController extends BaseController{
	private Logger logger =  LoggerFactory.getLogger(BrandController.class);

	@Autowired
	private RestTemplate template;
	
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/list")
	public Page<Map<String, Object>> list(Page<TbBrand> page){
		logger.info("page=>"+page.getSize()+"string=>"+page.toString());
		return template.getForObject(AppConsts.MANAGE_SERVICE_URL+"/brand/list", Page.class, page);
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/page")
	public Page<Map<String, Object>> page(){
		logger.info("queryMap[ "+this.getParams().toString()+" ]");
		Map<String, Object> queryMap = new HashMap<>();
		return template.getForObject(AppConsts.MANAGE_SERVICE_URL+"/brand/page"+InitPage.mapToQueryString(this.getParams()), Page.class, queryMap);
	}
	
	
}
