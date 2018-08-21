package com.pyg.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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
import com.pyg.utils.ValidateUtils;

@Service
public class BrandServiceImpl extends ServiceImpl<TbBrandMapper, TbBrand>	implements BrandService {

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
		if(type == 1) {
			return this.baseMapper.getInfo1(id);
		}else if(type == 2) {
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
		}else {
			brand.setId(IdWorker.getId());
			this.baseMapper.insert(brand);
			flag = true;
		}
		if(flag) {
			returnMap.put("id", brand.getId());
			returnMap.put("message", "提交成功！");
		}else {
			returnMap.put("message", "提交失败！");
		}
		return returnMap;
	}

	@Override
	public Integer delBeatch(List<Long>[] ids) {
		return this.delBeatch(ids);
	}

	@SuppressWarnings("resource")
	@Override
	public Result batchImport(String fileName, MultipartFile file) {
		InputStream in = null;
		Workbook wb = null;
		List<TbBrand> brandList = new ArrayList<>();
		try {
			in = file.getInputStream();
		} catch (IOException e) {
			logger.error("创建输入流失败...");
			e.printStackTrace();
			return Result.failure(500, "导入Excel创建输入流失败...");
		}
		boolean isExcel2003 = ValidateUtils.isExcel2003(fileName);
		if(isExcel2003) {
			try {
				wb = new HSSFWorkbook(in);
			} catch (IOException e) {
				logger.error("创建Excel2003 WorkBook失败...");
				e.printStackTrace();
				return Result.failure(500, "导入Excel创建Excel2003 WorkBook失败...");
			} 
		}else {
			try {
				wb = new XSSFWorkbook(in);
			} catch (IOException e) {
				logger.error("创建Excel2007 WorkBook失败...");
				e.printStackTrace();
				return Result.failure(500, "导入Excel创建Excel2007 WorkBook失败...");
			}
		}
		//获取第一列的表格
		Sheet sheet = wb.getSheetAt(0);
		logger.info("第一张表的行数："+sheet.getLastRowNum());
		//遍历行
		for(int i = 0; i < sheet.getLastRowNum(); i++) {
			Row row = sheet.getRow(i);
			if(row == null) 
				continue;
			TbBrand brand = new TbBrand();
			//遍历列
			logger.info("第一张表的"+i+" 行的列数："+row.getLastCellNum());
			for(int j = 0; j < row.getLastCellNum(); j++) {
				
			}
		}
		return null;
	}	
	
}
