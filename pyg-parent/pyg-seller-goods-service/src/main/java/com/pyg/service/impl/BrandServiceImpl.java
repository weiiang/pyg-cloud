package com.pyg.service.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.pyg.entity.TbBrand;
import com.pyg.entity.TbBrandExample;
import com.pyg.mapper.TbBrandMapper;
import com.pyg.page.InitPage;
import com.pyg.service.BrandService;

@Service
public class BrandServiceImpl extends ServiceImpl<TbBrandMapper, TbBrand>	implements BrandService {

	@Override
	public Page<TbBrand> pageList(TbBrandExample brandExample) {
		Page<TbBrand> page = new Page<>();
		page.setRecords(this.baseMapper.selectByExample(page, brandExample));
		return page;
	}

	@Override
	public Page<Map<String, Object>> getPage(Map<String, Object> queryParams) {
		Page<Map<String, Object>> page = new Page<>();
		page = InitPage.intanceFromMap(queryParams, page);
		return page.setRecords(this.baseMapper.getPage(page, queryParams));
	}	
	
}
