package com.pyg.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.pyg.entity.TbAddress;
import com.pyg.entity.TbAddressExample;

@Mapper
public interface TbAddressMapper extends BaseMapper<TbAddress>{
    long countByExample(TbAddressExample example);

    int deleteByExample(TbAddressExample example);

    int deleteByPrimaryKey(Long id);

    Integer insert(TbAddress record);

    int insertSelective(TbAddress record);

    List<TbAddress> selectByExample(TbAddressExample example);

    TbAddress selectByPrimaryKey(Long id);
    int updateByExample(@Param("record") TbAddress record, @Param("example") TbAddressExample example);

    int updateByPrimaryKeySelective(TbAddress record);

    int updateByPrimaryKey(TbAddress record);

    int batchInsert(@Param("list") List<TbAddress> list);

    int batchInsertSelective(@Param("list") List<TbAddress> list, @Param("selective") TbAddress.Column ... selective);
}