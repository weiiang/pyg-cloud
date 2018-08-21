package com.pyg.service;

import java.util.List;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.pyg.entity.Result;
import com.pyg.entity.TbBrand;
import com.pyg.entity.TbBrandExample;

public interface BrandService extends IService<TbBrand>{
	
	public Page<TbBrand> pageList(TbBrandExample brandExample);
	
	public Page<Map<String, Object>> getPage(Map<String, Object> qieryMap);
	
	public Map<String, Object> getInfo(int type, long id);
	
	public Integer delBeatch(List<Long> [] ids);
	
	public Map<String, Object> edit(TbBrand brand);

	public Result batchImport(String fileName, MultipartFile file);

}
