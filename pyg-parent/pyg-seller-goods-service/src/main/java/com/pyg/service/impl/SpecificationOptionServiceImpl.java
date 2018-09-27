package com.pyg.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.pyg.entity.Result;
import com.pyg.entity.TbSpecificationOption;
import com.pyg.mapper.TbSpecificationOptionMapper;
import com.pyg.service.SpecificationOptionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SpecificationOptionServiceImpl extends ServiceImpl<TbSpecificationOptionMapper, TbSpecificationOption>
        implements SpecificationOptionService {

    @Transactional
    @Override
    public Result editOption(List<TbSpecificationOption> optionList, long specId) {
        //先删除，再添加
        int delCount = 0;
        int addCount = 0;
        try {
            Map<String, Object> params = new HashMap<>();
            params.put("spec_id", specId);
            delCount = this.baseMapper.deleteByMap(params);
            addCount = this.baseMapper.batchInsert(optionList);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.failure(500, e.getMessage());
        }
        return Result.success("新增规格："+addCount+" 条！ "+"删除原有规格："+delCount+" 条！");
    }

    @Override
    public Result getListBySpecId(Long specId) {
        return Result.success(this.baseMapper.selectSpecOptionBySpecId(specId));
    }
}
