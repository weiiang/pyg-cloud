package com.pyg.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.toolkit.IdWorker;
import com.pyg.entity.Result;
import com.pyg.entity.TbBrand;
import com.pyg.entity.TbBrandExample;
import com.pyg.mapper.TbBrandMapper;
import com.pyg.page.InitPage;
import com.pyg.service.BrandService;
import com.pyg.utils.excel.ExcelReadUtils;

@Service
public class BrandServiceImpl extends ServiceImpl<TbBrandMapper, TbBrand> implements BrandService {

	@SuppressWarnings("unused")
	private Logger logger = LoggerFactory.getLogger(BrandServiceImpl.class);

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

	@Override
	public Map<String, Object> getInfo(int type, long id) {
		if (type == 1) {
			return this.baseMapper.getInfo1(id);
		} else if (type == 2) {
			return this.baseMapper.getInfo2(id);
		}
		return null;
	}

	@Override
	public Map<String, Object> edit(TbBrand brand) {
		Map<String, Object> returnMap = new HashMap<>();
		boolean flag = false;
		if (brand.getId() != null) {
			this.baseMapper.updateById(brand);
			flag = true;
		} else {
			brand.setId(IdWorker.getId());
			this.baseMapper.insert(brand);
			flag = true;
		}
		if (flag) {
			returnMap.put("id", brand.getId());
			returnMap.put("message", "提交成功！");
		} else {
			returnMap.put("message", "提交失败！");
		}
		return returnMap;
	}

	@Override
	public Integer delBeatch(List<Long>[] ids) {
		return this.delBeatch(ids);
	}

	@Override
	public Result batchImport(String fileName, MultipartFile file) {
		//属性列表,与excel的顺序相对应
		String[] properties = { "name", "first_char"};
		@SuppressWarnings("unchecked")
		List<Object> list = (List<Object>) ExcelReadUtils.getExcelList(fileName, file, TbBrand.class,properties).getData();
		@SuppressWarnings("unchecked")
		List<TbBrand> list2 = (List<TbBrand>)(List<?>)list;
		for (TbBrand tbBrand : list2) {
			System.out.println(tbBrand.getFirst_char());
			System.out.println(tbBrand.getName());
		}
		this.baseMapper.batchInsert(list2);
		return Result.success(list2);
	}


	
	
}