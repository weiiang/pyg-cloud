package com.pyg.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.pyg.entity.TbBrand;
import com.pyg.entity.TbBrandExample;


@Mapper
public interface TbBrandMapper extends BaseMapper<TbBrand>{
	
	/**
	 * 分页查询
	 * @param page	分页封装类
	 * @param example	条件查询参数
	 * @return
	 */
	List<TbBrand> selectByExample(Pagination page, TbBrandExample example);
   
    long countByExample(TbBrandExample example);

    int deleteByExample(TbBrandExample example);

    int deleteByPrimaryKey(Long id);

    Integer insert(TbBrand record);

    int insertSelective(TbBrand record);

   

    TbBrand selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbBrand record, @Param("example") TbBrandExample example);

    int updateByExample(@Param("record") TbBrand record, @Param("example") TbBrandExample example);

    int updateByPrimaryKeySelective(TbBrand record);

    int updateByPrimaryKey(TbBrand record);

    int batchInsert(@Param("list") List<TbBrand> list);

    int batchInsertSelective(@Param("list") List<TbBrand> list, @Param("selective") TbBrand.Column ... selective);



	
}