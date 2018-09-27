package com.pyg.manage.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.pyg.base.controller.BaseController;
import com.pyg.entity.Result;
import com.pyg.entity.TbSpecificationOption;
import com.pyg.service.SpecificationOptionService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/specification-option")
public class SpecificationOptionController extends BaseController {

    @Autowired
    private SpecificationOptionService specificationOptionService;

    @ApiOperation(value = "根据规格ID查询规格参数详情列表API", notes = " 查询规格参数详情列表 " )
    @GetMapping("/spec-list")
    public Result getOptionListBySpecId(@RequestParam("specId")long specId){
        return specificationOptionService.getListBySpecId(specId);
    }

    @ApiOperation(value = "规格参数批量编辑API", notes = " 规格参数批量编辑 " )
    @GetMapping("/edit-option-list")
    public Result editOptionListBySpecId(@RequestParam("specId")long specId, @RequestBody List<TbSpecificationOption> specificationOptionList){
        return specificationOptionService.editOption(specificationOptionList, specId);
    }
}
