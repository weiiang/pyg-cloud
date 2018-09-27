package com.pyg.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.pyg.entity.TbSpecificationOption;
import com.pyg.entity.TbSpecificationOptionExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TbSpecificationOptionMapper extends BaseMapper<TbSpecificationOption>{

    /**
     * 根据specId查询规格详情列表
     * @param specId
     * @return
     */
    List<Map<String,Object>> selectSpecOptionBySpecId(@Param("specId") Long specId);

    
    long countByExample(TbSpecificationOptionExample example);

    int deleteByExample(TbSpecificationOptionExample example);

    int deleteByPrimaryKey(Long id);

    Integer insert(TbSpecificationOption record);

    int insertSelective(TbSpecificationOption record);

    List<TbSpecificationOption> selectByExample(TbSpecificationOptionExample example);

    TbSpecificationOption selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbSpecificationOption record, @Param("example") TbSpecificationOptionExample example);

    int updateByExample(@Param("record") TbSpecificationOption record, @Param("example") TbSpecificationOptionExample example);

    int updateByPrimaryKeySelective(TbSpecificationOption record);

    int updateByPrimaryKey(TbSpecificationOption record);

    int batchInsert(@Param("list") List<TbSpecificationOption> list);

    int batchInsertSelective(@Param("list") List<TbSpecificationOption> list, @Param("selective") TbSpecificationOption.Column ... selective);


}