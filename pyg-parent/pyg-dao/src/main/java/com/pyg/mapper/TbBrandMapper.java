package com.pyg.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.pyg.entity.TbBrand;
import com.pyg.entity.TbBrandExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbBrandMapper extends BaseMapper<TbBrand>{
   
    long countByExample(TbBrandExample example);

    int deleteByExample(TbBrandExample example);

    int deleteByPrimaryKey(Long id);

    Integer insert(TbBrand record);

    int insertSelective(TbBrand record);

    List<TbBrand> selectByExample(Page<TbBrand> page, TbBrandExample example);

    TbBrand selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbBrand record, @Param("example") TbBrandExample example);

    int updateByExample(@Param("record") TbBrand record, @Param("example") TbBrandExample example);

    int updateByPrimaryKeySelective(TbBrand record);

    int updateByPrimaryKey(TbBrand record);

    int batchInsert(@Param("list") List<TbBrand> list);

    int batchInsertSelective(@Param("list") List<TbBrand> list, @Param("selective") TbBrand.Column ... selective);



	
}