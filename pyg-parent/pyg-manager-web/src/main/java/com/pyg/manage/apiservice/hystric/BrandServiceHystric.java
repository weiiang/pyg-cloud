package com.pyg.manage.apiservice.hystric;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.baomidou.mybatisplus.plugins.Page;
import com.pyg.entity.Result;
import com.pyg.entity.TbBrand;
import com.pyg.manage.apiservice.BrandService;

public class BrandServiceHystric implements BrandService{
	
	private Logger logger = LoggerFactory.getLogger(BrandServiceHystric.class);

	@Override
	public Page<Map<String, Object>> page(Map<String, Object> params) {
		logger.error("品牌服务=>分页查询服务调用失败!");
		return null;
	}

	@Override
	public Result getInfo(long id, int type) {
		logger.error("品牌服务=>根据ID查询信息服务调用失败!");
		return null;
	}

	@Override
	public Result edit(TbBrand brand) {
		logger.error("品牌服务=>添加修改服务调用失败!");
		return null;
	}

	@Override
	public Result delete(List<Long> ids) {
		logger.error("品牌服务=>删除服务调用失败!");
		return null;
	}

}
