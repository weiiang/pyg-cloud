package com.pyg.manage.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.pyg.base.controller.BaseController;
import com.pyg.entity.Result;
import com.pyg.entity.TbBrand;
import com.pyg.entity.TbSpecification;
import com.pyg.service.SpecifyicationService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/specification")
public class SpecificationController extends BaseController {

    @Autowired
    private SpecifyicationService specifyicationService;

    @ApiOperation(value = "查询规格分页列表API", notes = " 查询规格分页列表 " )
    @GetMapping("/page")
    public Page<Map<String, Object>> getPageList(){
        return specifyicationService.getPageList(this.getParams());
    }

    @ApiOperation(value = "根据ID查询规格信息API", notes = "type=1查询详情,type=2,回显编辑的信息")
    @ApiImplicitParams({ // 传递的参数说明,该类型的参数是拼接在url后面的
            @ApiImplicitParam(name = "id", value = "id", required = true, dataType = "long", paramType = "query"),
            @ApiImplicitParam(name = "type", value = "type", required = true, dataType = "int", paramType = "query") })
    @GetMapping("/info")
    public Result getInfo(int type, long id) {
       return specifyicationService.getInfo(id, type);
    }

    @ApiOperation(value = "编辑新增通用API", notes = "当ID为空的时候新增,ID不为空的时候修改")
    @PostMapping("/edit")
    public Result edit(@RequestBody TbSpecification tbSpecification) {
       return specifyicationService.edit(tbSpecification);
    }

    @ApiOperation(value = "单个删除/批量删除通用API", notes = "当List只有一条数据删除单个,当多条数据逐个删除")
    @DeleteMapping("/del")
    public Result del(@RequestParam("ids[]")List<Long> ids) {
       return specifyicationService.batchDels(ids);
    }
}
