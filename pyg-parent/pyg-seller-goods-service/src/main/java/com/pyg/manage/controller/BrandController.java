package com.pyg.manage.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.baomidou.mybatisplus.plugins.Page;
import com.pyg.base.controller.BaseController;
import com.pyg.entity.Result;
import com.pyg.entity.TbBrand;
import com.pyg.entity.TbBrandExample;
import com.pyg.service.BrandService;
import com.pyg.utils.ValidateUtils;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/brand")
public class BrandController extends BaseController {

	private Logger logger = LoggerFactory.getLogger(BrandController.class);

	@Autowired
	private BrandService brandService;

	@ApiOperation(value = "查询全部品牌信息列表", notes = "返回品牌信息list,可以根据属性查询")
	@GetMapping("/list")
	public Page<TbBrand> list(TbBrandExample brandExample) {
		return brandService.pageList(brandExample);
	}

	@ApiOperation(value = "分页查询,默认每页十条数据", notes = "可根据Map封装参数进行条件查询")
	@GetMapping("/page")
	public Page<Map<String, Object>> page() {
		return brandService.getPage(this.getParams());
	}

	@ApiOperation(value = "根据ID查询品牌信息", notes = "type=1查询详情,type=2,回显编辑的信息")
	@ApiImplicitParams({ // 传递的参数说明,该类型的参数是拼接在url后面的
			@ApiImplicitParam(name = "id", value = "id", required = true, dataType = "long", paramType = "query"),
			@ApiImplicitParam(name = "type", value = "type", required = true, dataType = "int", paramType = "query") })
	@GetMapping("/info")
	public Result getInfo(int type, long id) {
		Result result = null;
		try {
			result = Result.success(brandService.getInfo(type, id));
			return result;
		} catch (Exception e) {
			result = Result.failure(500, e.getMessage(), null);
			logger.error("根据ID查询品牌信息失败<--->result:" + result.toString());
			return result;
		}
	}

	@ApiOperation(value = "编辑新增通用API", notes = "当ID为空的时候新增,ID不为空的时候修改")
	@PostMapping("/edit")
	public Result edit(TbBrand tbBrand) {
		try {
			Map<String, Object> returnMap = brandService.edit(tbBrand);
			return Result.success(returnMap);
		} catch (Exception e) {
			Result result = Result.failure(500, e.getMessage(), null);
			logger.error("修改品牌信息失败<--->result:" + result.toString());
			return result;
		}

	}

	@ApiOperation(value = "单个删除/批量删除通用API", notes = "当List只有一条数据删除单个,当多条数据逐个删除")
	@PostMapping("/del")
	public Result del(List<Long>[] ids) {
		try {
			Integer delCount = brandService.delBeatch(ids);
			return Result.success(delCount);
		} catch (Exception e) {
			Result result = Result.failure(500, e.getMessage(), null);
			logger.error("删除品牌信息失败<--->result:" + result.toString());
			return result;
		}

	}

	@ApiOperation(value = "导入品牌信息API", notes = "参数为文件")
	@PostMapping("/import")
	public Result importExcel(@RequestParam(value = "file") MultipartFile file) {
		Result result = null;
		boolean flag = false;
		String fileName = file.getOriginalFilename();		
		flag = ValidateUtils.isExcel(fileName);
		if( !flag) {
			result = Result.failure(405, "请上传excel文件...");
			return result;
		}
		try {
			result = brandService.batchImport(fileName, file);
		} catch (Exception e) {
			logger.error("导入品牌信息失败！");
			result = Result.failure(500, e.getMessage(), null);
			e.printStackTrace();
		}
		return result;
	}
}
