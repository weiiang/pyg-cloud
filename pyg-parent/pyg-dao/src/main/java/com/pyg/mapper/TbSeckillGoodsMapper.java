package com.pyg.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.pyg.entity.TbSeckillGoods;
import com.pyg.entity.TbSeckillGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSeckillGoodsMapper extends BaseMapper<TbSeckillGoods>{
    
    long countByExample(TbSeckillGoodsExample example);

    int deleteByExample(TbSeckillGoodsExample example);

    int deleteByPrimaryKey(Long id);

    Integer insert(TbSeckillGoods record);

    int insertSelective(TbSeckillGoods record);

    List<TbSeckillGoods> selectByExample(TbSeckillGoodsExample example);

    TbSeckillGoods selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbSeckillGoods record, @Param("example") TbSeckillGoodsExample example);

    int updateByExample(@Param("record") TbSeckillGoods record, @Param("example") TbSeckillGoodsExample example);

    int updateByPrimaryKeySelective(TbSeckillGoods record);

    int updateByPrimaryKey(TbSeckillGoods record);

    int batchInsert(@Param("list") List<TbSeckillGoods> list);

    int batchInsertSelective(@Param("list") List<TbSeckillGoods> list, @Param("selective") TbSeckillGoods.Column ... selective);
}