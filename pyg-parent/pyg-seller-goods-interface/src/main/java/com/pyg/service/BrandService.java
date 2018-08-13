package com.pyg.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.pyg.entity.TbBrand;
import com.pyg.entity.TbBrandExample;

public interface BrandService extends IService<TbBrand>{
	
	
	public Page<TbBrand> pageList(TbBrandExample brandExample);

}
