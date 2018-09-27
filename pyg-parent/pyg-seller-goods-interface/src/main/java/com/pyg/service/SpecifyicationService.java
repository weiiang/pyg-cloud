package com.pyg.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.pyg.entity.Result;
import com.pyg.entity.TbSpecification;

import java.util.List;
import java.util.Map;

public interface SpecifyicationService extends IService<TbSpecification> {

    public Page<Map<String, Object>> getPageList(Map<String, Object> params);

    public Result getInfo(long id, int type);

    public Result edit(TbSpecification specification);

    public Result batchDels(List<Long> ids);
}
