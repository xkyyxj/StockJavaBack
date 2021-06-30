package com.serpent.stock.mapper;

import com.serpent.stock.beans.StockList;
import com.serpent.stock.beans.StockListExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockListMapper {
    long countByExample(StockListExample example);

    int deleteByExample(StockListExample example);

    int deleteByPrimaryKey(String tsCode);

    int insert(StockList record);

    int insertSelective(StockList record);

    List<StockList> selectByExample(StockListExample example);

    StockList selectByPrimaryKey(String tsCode);

    int updateByExampleSelective(@Param("record") StockList record, @Param("example") StockListExample example);

    int updateByExample(@Param("record") StockList record, @Param("example") StockListExample example);

    int updateByPrimaryKeySelective(StockList record);

    int updateByPrimaryKey(StockList record);

    List<String> selectAllTsCodes();
}