package com.pyg.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pyg.entity.TbFreightTemplate;
import com.pyg.entity.TbFreightTemplateExample;

public interface TbFreightTemplateMapper {
    /**
     */
    long countByExample(TbFreightTemplateExample example);

    /**
     */
    int deleteByExample(TbFreightTemplateExample example);

    /**
     */
    int deleteByPrimaryKey(Long id);

    /**
     */
    int insert(TbFreightTemplate record);

    /**
     */
    int insertSelective(TbFreightTemplate record);

    /**
     */
    List<TbFreightTemplate> selectByExample(TbFreightTemplateExample example);

    /**
     */
    TbFreightTemplate selectByPrimaryKey(Long id);

    /**
     */
    int updateByExampleSelective(@Param("record") TbFreightTemplate record, @Param("example") TbFreightTemplateExample example);

    /**
     */
    int updateByExample(@Param("record") TbFreightTemplate record, @Param("example") TbFreightTemplateExample example);

    /**
     */
    int updateByPrimaryKeySelective(TbFreightTemplate record);

    /**
     */
    int updateByPrimaryKey(TbFreightTemplate record);

    /**
     */
    int batchInsert(@Param("list") List<TbFreightTemplate> list);

    /**
     */
    int batchInsertSelective(@Param("list") List<TbFreightTemplate> list, @Param("selective") TbFreightTemplate.Column ... selective);
}