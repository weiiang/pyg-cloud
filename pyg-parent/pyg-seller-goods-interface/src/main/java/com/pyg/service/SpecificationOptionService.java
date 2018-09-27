package com.pyg.service;

import com.baomidou.mybatisplus.service.IService;
import com.pyg.entity.Result;
import com.pyg.entity.TbSpecificationOption;

import java.util.List;

public interface SpecificationOptionService extends IService<TbSpecificationOption> {

    /**
     * 批量插入
     * @param optionList
     * @return
     */
    public Result editOption(List<TbSpecificationOption> optionList, long specId);

    /**
     * 根据规格ID查询规格详情
     * @param specId
     * @return
     */
    public Result getListBySpecId(Long specId);


}
