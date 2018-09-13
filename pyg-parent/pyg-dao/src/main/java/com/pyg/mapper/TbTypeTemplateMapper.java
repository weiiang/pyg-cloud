package com.pyg.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.pyg.entity.TbTypeTemplate;
import com.pyg.entity.TbTypeTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbTypeTemplateMapper extends BaseMapper<TbTypeTemplate>{
    
    long countByExample(TbTypeTemplateExample example);

    int deleteByExample(TbTypeTemplateExample example);

    int deleteByPrimaryKey(Long id);

    Integer insert(TbTypeTemplate record);

    int insertSelective(TbTypeTemplate record);

    List<TbTypeTemplate> selectByExample(TbTypeTemplateExample example);

    TbTypeTemplate selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbTypeTemplate record, @Param("example") TbTypeTemplateExample example);

    int updateByExample(@Param("record") TbTypeTemplate record, @Param("example") TbTypeTemplateExample example);

    int updateByPrimaryKeySelective(TbTypeTemplate record);

    int updateByPrimaryKey(TbTypeTemplate record);

    int batchInsert(@Param("list") List<TbTypeTemplate> list);

    int batchInsertSelective(@Param("list") List<TbTypeTemplate> list, @Param("selective") TbTypeTemplate.Column ... selective);
}