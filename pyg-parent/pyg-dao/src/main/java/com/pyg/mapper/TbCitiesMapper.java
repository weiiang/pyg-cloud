package com.pyg.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.pyg.entity.TbCities;
import com.pyg.entity.TbCitiesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCitiesMapper extends BaseMapper<TbCities>{
	
    long countByExample(TbCitiesExample example);

    int deleteByExample(TbCitiesExample example);

    int deleteByPrimaryKey(Integer id);

    Integer insert(TbCities record);

    int insertSelective(TbCities record);

    List<TbCities> selectByExample(TbCitiesExample example);

    TbCities selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbCities record, @Param("example") TbCitiesExample example);

    int updateByExample(@Param("record") TbCities record, @Param("example") TbCitiesExample example);

    int updateByPrimaryKeySelective(TbCities record);

    int updateByPrimaryKey(TbCities record);

    int batchInsert(@Param("list") List<TbCities> list);

    int batchInsertSelective(@Param("list") List<TbCities> list, @Param("selective") TbCities.Column ... selective);
}