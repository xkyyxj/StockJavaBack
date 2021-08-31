package com.serpent.stock.mapper;

import com.serpent.stock.beans.NDayUp;
import com.serpent.stock.beans.NDayUpExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NDayUpMapper {
    long countByExample(NDayUpExample example);

    int deleteByExample(NDayUpExample example);

    int deleteByPrimaryKey(Integer pkTwoUp);

    int insert(NDayUp record);

    int insertSelective(NDayUp record);

    List<NDayUp> selectByExample(NDayUpExample example);

    NDayUp selectByPrimaryKey(Integer pkTwoUp);

    int updateByExampleSelective(@Param("record") NDayUp record, @Param("example") NDayUpExample example);

    int updateByExample(@Param("record") NDayUp record, @Param("example") NDayUpExample example);

    int updateByPrimaryKeySelective(NDayUp record);

    int updateByPrimaryKey(NDayUp record);

    List<String> queryLatestDay(@Param("limitNum") String limitNum);
}