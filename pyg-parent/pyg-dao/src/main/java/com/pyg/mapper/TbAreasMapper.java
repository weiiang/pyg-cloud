package com.pyg.mapper;

import com.pyg.entity.TbAreas;
import com.pyg.entity.TbAreasExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbAreasMapper {
    /**
     */
    long countByExample(TbAreasExample example);

    /**
     */
    int deleteByExample(TbAreasExample example);

    /**
     */
    int deleteByPrimaryKey(Integer id);

    /**
     */
    int insert(TbAreas record);

    /**
     */
    int insertSelective(TbAreas record);

    /**
     */
    List<TbAreas> selectByExample(TbAreasExample example);

    /**
     */
    TbAreas selectByPrimaryKey(Integer id);

    /**
     */
    int updateByExampleSelective(@Param("record") TbAreas record, @Param("example") TbAreasExample example);

    /**
     */
    int updateByExample(@Param("record") TbAreas record, @Param("example") TbAreasExample example);

    /**
     */
    int updateByPrimaryKeySelective(TbAreas record);

    /**
     */
    int updateByPrimaryKey(TbAreas record);

    /**
     */
    int batchInsert(@Param("list") List<TbAreas> list);

    /**
     */
    int batchInsertSelective(@Param("list") List<TbAreas> list, @Param("selective") TbAreas.Column ... selective);
}