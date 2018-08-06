package com.pyg.mapper;

import com.pyg.entity.TbItem;
import com.pyg.entity.TbItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbItemMapper {
    /**
     */
    long countByExample(TbItemExample example);

    /**
     */
    int deleteByExample(TbItemExample example);

    /**
     */
    int deleteByPrimaryKey(Long id);

    /**
     */
    int insert(TbItem record);

    /**
     */
    int insertSelective(TbItem record);

    /**
     */
    List<TbItem> selectByExample(TbItemExample example);

    /**
     */
    TbItem selectByPrimaryKey(Long id);

    /**
     */
    int updateByExampleSelective(@Param("record") TbItem record, @Param("example") TbItemExample example);

    /**
     */
    int updateByExample(@Param("record") TbItem record, @Param("example") TbItemExample example);

    /**
     */
    int updateByPrimaryKeySelective(TbItem record);

    /**
     */
    int updateByPrimaryKey(TbItem record);

    /**
     */
    int batchInsert(@Param("list") List<TbItem> list);

    /**
     */
    int batchInsertSelective(@Param("list") List<TbItem> list, @Param("selective") TbItem.Column ... selective);
}