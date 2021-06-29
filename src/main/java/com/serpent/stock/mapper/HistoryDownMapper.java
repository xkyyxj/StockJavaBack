package com.serpent.stock.mapper;

import com.serpent.stock.beans.HistoryDown;
import com.serpent.stock.beans.HistoryDownExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface HistoryDownMapper {
    long countByExample(HistoryDownExample example);

    int deleteByExample(HistoryDownExample example);

    int deleteByPrimaryKey(Integer pkHistoryDown);

    int insert(HistoryDown record);

    int insertSelective(HistoryDown record);

    List<HistoryDown> selectByExample(HistoryDownExample example);

    HistoryDown selectByPrimaryKey(Integer pkHistoryDown);

    int updateByExampleSelective(@Param("record") HistoryDown record, @Param("example") HistoryDownExample example);

    int updateByExample(@Param("record") HistoryDown record, @Param("example") HistoryDownExample example);

    int updateByPrimaryKeySelective(HistoryDown record);

    int updateByPrimaryKey(HistoryDown record);
}