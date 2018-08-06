package com.pyg.mapper;

import com.pyg.entity.TbContent;
import com.pyg.entity.TbContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbContentMapper {
    /**
     */
    long countByExample(TbContentExample example);

    /**
     */
    int deleteByExample(TbContentExample example);

    /**
     */
    int deleteByPrimaryKey(Long id);

    /**
     */
    int insert(TbContent record);

    /**
     */
    int insertSelective(TbContent record);

    /**
     */
    List<TbContent> selectByExample(TbContentExample example);

    /**
     */
    TbContent selectByPrimaryKey(Long id);

    /**
     */
    int updateByExampleSelective(@Param("record") TbContent record, @Param("example") TbContentExample example);

    /**
     */
    int updateByExample(@Param("record") TbContent record, @Param("example") TbContentExample example);

    /**
     */
    int updateByPrimaryKeySelective(TbContent record);

    /**
     */
    int updateByPrimaryKey(TbContent record);

    /**
     */
    int batchInsert(@Param("list") List<TbContent> list);

    /**
     */
    int batchInsertSelective(@Param("list") List<TbContent> list, @Param("selective") TbContent.Column ... selective);
}