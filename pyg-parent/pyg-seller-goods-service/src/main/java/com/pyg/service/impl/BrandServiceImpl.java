package com.pyg.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.pyg.entity.TbBrand;
import com.pyg.entity.TbBrandExample;
import com.pyg.mapper.TbBrandMapper;
import com.pyg.service.BrandService;

@Service
public class BrandServiceImpl extends ServiceImpl<TbBrandMapper, TbBrand>	implements BrandService {

	@Override
	public Page<TbBrand> pageList(TbBrandExample brandExample) {
		Page<TbBrand> page = new Page<>();
		page.setRecords(this.baseMapper.selectByExample(page, brandExample));
		return page;
	}	
	
}
