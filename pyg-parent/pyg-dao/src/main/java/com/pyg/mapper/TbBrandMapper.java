package com.pyg.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.pyg.entity.TbBrand;
import com.pyg.entity.TbBrandExample;


@Mapper
public interface TbBrandMapper extends BaseMapper<TbBrand>{
	
	/**
	 * 分页条件查询
	 * @param page	分页记录
	 * @param params	参数map
	 * @return
	 */
	List<Map<String, Object>> getPage(Pagination page, @Param("params")Map<String, Object> params);
	
	/**
	 * 分页查询
	 * @param page	分页封装类
	 * @param example	条件查询参数
	 * @return
	 */
	List<TbBrand> selectByExample(Pagination page, TbBrandExample example);
	
	/**
	 * 查看详情
	 * @param id
	 * @return
	 */
	Map<String, Object> getInfo1(@Param("id")long id);

	/**
	 * 编辑时候的数据回显
	 * @param id
	 * @return
	 */
	Map<String, Object> getInfo2(@Param("id")long id);
	
	
	
   
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