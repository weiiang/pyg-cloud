package com.pyg.mapper;

import com.pyg.entity.TbSeckillOrder;
import com.pyg.entity.TbSeckillOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSeckillOrderMapper {
    /**
     */
    long countByExample(TbSeckillOrderExample example);

    /**
     */
    int deleteByExample(TbSeckillOrderExample example);

    /**
     */
    int deleteByPrimaryKey(Long id);

    /**
     */
    int insert(TbSeckillOrder record);

    /**
     */
    int insertSelective(TbSeckillOrder record);

    /**
     */
    List<TbSeckillOrder> selectByExample(TbSeckillOrderExample example);

    /**
     */
    TbSeckillOrder selectByPrimaryKey(Long id);

    /**
     */
    int updateByExampleSelective(@Param("record") TbSeckillOrder record, @Param("example") TbSeckillOrderExample example);

    /**
     */
    int updateByExample(@Param("record") TbSeckillOrder record, @Param("example") TbSeckillOrderExample example);

    /**
     */
    int updateByPrimaryKeySelective(TbSeckillOrder record);

    /**
     */
    int updateByPrimaryKey(TbSeckillOrder record);

    /**
     */
    int batchInsert(@Param("list") List<TbSeckillOrder> list);

    /**
     */
    int batchInsertSelective(@Param("list") List<TbSeckillOrder> list, @Param("selective") TbSeckillOrder.Column ... selective);
}