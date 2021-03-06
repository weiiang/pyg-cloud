package com.pyg.manage.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.plugins.Page;
import com.pyg.base.controller.BaseController;
import com.pyg.entity.Result;
import com.pyg.entity.TbBrand;
import com.pyg.manage.apiservice.TbBrandService;

@RestController
@RequestMapping("/brand")
public class BrandController extends BaseController{
	private Logger logger =  LoggerFactory.getLogger(BrandController.class);

//	@Autowired
//	private RestTemplate template;
	
	@Autowired
	private TbBrandService brandService;
	
	
//	@SuppressWarnings("unchecked")
//	@RequestMapping("/list")
//	public Page<Map<String, Object>> list(Page<TbBrand> page){
//		logger.info("page=>"+page.getSize()+"string=>"+page.toString());
//		return template.getForObject(AppConsts.MANAGE_SERVICE_URL+"/brand/list", Page.class, page);
//	}
//	
//	@SuppressWarnings("unchecked")
//	@RequestMapping("/page")
//	public Page<Map<String, Object>> page(){
//		logger.info("queryMap[ "+this.getParams().toString()+" ]");
//		Map<String, Object> queryMap = new HashMap<>();
//		return template.getForObject(AppConsts.MANAGE_SERVICE_URL+"/brand/page"+InitPage.mapToQueryString(this.getParams()), Page.class, queryMap);
//	}
	
	@GetMapping("/list")
	public Page<Map<String, Object>> getPageList(){
//		Result result =  Result.success(brandService.page(this.getParams()));
//		System.out.println(result.getData().toString());
		return brandService.page(this.getParams());
	}
	
	@GetMapping("/info")
	public Result getInfo(long id, int type){
		return brandService.getInfo(id, type);
	}
	
	@PostMapping("")
	public Result edit(@RequestBody TbBrand brand){
		logger.info("--------------------->"+brand.getName());
		return brandService.edit(brand);
	}
	
	@DeleteMapping("/del")
	public Result del(@RequestParam("ids[]")List<Long> ids){
		return brandService.delete(ids);
	}

	
	
	
}
