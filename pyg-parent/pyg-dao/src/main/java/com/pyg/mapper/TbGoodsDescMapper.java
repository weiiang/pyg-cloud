package com.pyg.mapper;

import com.pyg.entity.TbGoodsDesc;
import com.pyg.entity.TbGoodsDescExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbGoodsDescMapper {
    /**
     */
    long countByExample(TbGoodsDescExample example);

    /**
     */
    int deleteByExample(TbGoodsDescExample example);

    /**
     */
    int deleteByPrimaryKey(Long goods_id);

    /**
     */
    int insert(TbGoodsDesc record);

    /**
     */
    int insertSelective(TbGoodsDesc record);

    /**
     */
    List<TbGoodsDesc> selectByExample(TbGoodsDescExample example);

    /**
     */
    TbGoodsDesc selectByPrimaryKey(Long goods_id);

    /**
     */
    int updateByExampleSelective(@Param("record") TbGoodsDesc record, @Param("example") TbGoodsDescExample example);

    /**
     */
    int updateByExample(@Param("record") TbGoodsDesc record, @Param("example") TbGoodsDescExample example);

    /**
     */
    int updateByPrimaryKeySelective(TbGoodsDesc record);

    /**
     */
    int updateByPrimaryKey(TbGoodsDesc record);

    /**
     */
    int batchInsert(@Param("list") List<TbGoodsDesc> list);

    /**
     */
    int batchInsertSelective(@Param("list") List<TbGoodsDesc> list, @Param("selective") TbGoodsDesc.Column ... selective);
}