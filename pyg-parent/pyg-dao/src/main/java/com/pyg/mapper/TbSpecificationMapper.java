package com.pyg.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.pyg.entity.TbSpecification;
import com.pyg.entity.TbSpecificationExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbSpecificationMapper extends BaseMapper<TbSpecification>{


    /**
     * 分页列表
     * @param page
     * @param params
     * @return
     */
    List<Map<String, Object>> getPageList(Pagination page, @Param("params")Map<String, Object> params);

    /**
     * 编辑时候的回显
     * @param id
     * @return
     */
    Map<String, Object> getInfo1(@Param("id")long id);

    /**
     * 查看详情
     * @param id
     * @return
     */
    Map<String, Object> getInfo2(@Param("id")long id);

    
    long countByExample(TbSpecificationExample example);

    int deleteByExample(TbSpecificationExample example);

    int deleteByPrimaryKey(Long id);

    Integer insert(TbSpecification record);

    int insertSelective(TbSpecification record);

    List<TbSpecification> selectByExample(TbSpecificationExample example);

    TbSpecification selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbSpecification record, @Param("example") TbSpecificationExample example);

    int updateByExample(@Param("record") TbSpecification record, @Param("example") TbSpecificationExample example);

    int updateByPrimaryKeySelective(TbSpecification record);

    int updateByPrimaryKey(TbSpecification record);

    int batchInsert(@Param("list") List<TbSpecification> list);

    int batchInsertSelective(@Param("list") List<TbSpecification> list, @Param("selective") TbSpecification.Column ... selective);
}