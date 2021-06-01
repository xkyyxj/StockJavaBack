package com.cassiopeia.stock.mapper;

import com.cassiopeia.stock.beans.AnaCategory;
import com.cassiopeia.stock.beans.AnaCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnaCategoryMapper {
    long countByExample(AnaCategoryExample example);

    int deleteByExample(AnaCategoryExample example);

    int deleteByPrimaryKey(Integer pkCategory);

    int insert(AnaCategory record);

    int insertSelective(AnaCategory record);

    List<AnaCategory> selectByExample(AnaCategoryExample example);

    AnaCategory selectByPrimaryKey(Integer pkCategory);

    int updateByExampleSelective(@Param("record") AnaCategory record, @Param("example") AnaCategoryExample example);

    int updateByExample(@Param("record") AnaCategory record, @Param("example") AnaCategoryExample example);

    int updateByPrimaryKeySelective(AnaCategory record);

    int updateByPrimaryKey(AnaCategory record);
}