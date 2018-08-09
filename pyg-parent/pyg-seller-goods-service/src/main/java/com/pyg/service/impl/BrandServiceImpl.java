package com.pyg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.plugins.Page;
import com.pyg.entity.TbBrand;
import com.pyg.mapper.TbBrandMapper;
import com.pyg.service.BrandService;

@Service
public class BrandServiceImpl implements BrandService {
	@Autowired
	private TbBrandMapper brandMapper;
	
	@Override
	public List<TbBrand> list() {
		Page<TbBrand> page = new Page<TbBrand>(1,10);
		return brandMapper.selectByExample(page, null);
	}

}
