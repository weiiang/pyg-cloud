package com.pyg.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.pyg.entity.TbSpecification;
import com.pyg.entity.TbSpecificationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSpecificationMapper extends BaseMapper<TbSpecification>{
    
    long countByExample(TbSpecificationExample example);

    int deleteByExample(TbSpecificationExample example);

    int deleteByPrimaryKey(Long id);

    Integer insert(TbSpecification record);

    int insertSelective(TbSpecification record);

    List<TbSpecification> selectByExample(TbSpecificationExample example);

    TbSpecification selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbSpecification record, @Param("example") TbSpecificationExample example);

    int updateByExample(@Param("record") TbSpecification record, @Param("example") TbSpecificationExample example);

    int updateByPrimaryKeySelective(TbSpecification record);

    int updateByPrimaryKey(TbSpecification record);

    int batchInsert(@Param("list") List<TbSpecification> list);

    int batchInsertSelective(@Param("list") List<TbSpecification> list, @Param("selective") TbSpecification.Column ... selective);
}