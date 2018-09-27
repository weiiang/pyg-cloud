package com.pyg.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.toolkit.IdWorker;
import com.pyg.entity.Result;
import com.pyg.entity.TbSpecification;
import com.pyg.mapper.TbSpecificationMapper;
import com.pyg.page.InitPage;
import com.pyg.service.SpecifyicationService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SpecificationServiceImpl extends ServiceImpl<TbSpecificationMapper, TbSpecification> implements SpecifyicationService  {
    @Override
    public Page<Map<String, Object>> getPageList(Map<String, Object> params) {
        Page<Map<String, Object>> page = new Page<>();
        page = InitPage.intanceFromMap(params, page);
        List<Map<String, Object>> list = this.baseMapper.getPageList(page, params);
        page.setRecords(list);
        return page;
    }

    @Override
    public Result getInfo(long id, int type) {
        try {
            if (type == 1){
                return Result.success(this.baseMapper.getInfo1(id));
            }else {
                return  Result.success(this.baseMapper.getInfo2(id));
            }
        } catch (Exception e) {
            e.printStackTrace();
            return  Result.failure(500, e.getMessage());
        }
    }

    @Override
    public Result edit(TbSpecification specification) {
        if (specification.getId() != null){//编辑
            this.baseMapper.updateById(specification);
        }else {//新增
            specification.setId(IdWorker.getId());
            this.baseMapper.insert(specification);
        }
        return Result.success(specification.getId());
    }

    @Override
    public Result batchDels(List<Long> ids) {
        int n = this.baseMapper.deleteBatchIds(ids);
        return Result.success(n);
    }
}
