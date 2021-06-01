package com.cassiopeia.stock.mapper;

import com.cassiopeia.stock.beans.StockIndexBaseinfo;
import com.cassiopeia.stock.beans.StockIndexBaseinfoExample;
import com.cassiopeia.stock.beans.StockIndexBaseinfoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockIndexBaseinfoMapper {
    long countByExample(StockIndexBaseinfoExample example);

    int deleteByExample(StockIndexBaseinfoExample example);

    int deleteByPrimaryKey(StockIndexBaseinfoKey key);

    int insert(StockIndexBaseinfo record);

    int insertSelective(StockIndexBaseinfo record);

    List<StockIndexBaseinfo> selectByExample(StockIndexBaseinfoExample example);

    StockIndexBaseinfo selectByPrimaryKey(StockIndexBaseinfoKey key);

    int updateByExampleSelective(@Param("record") StockIndexBaseinfo record, @Param("example") StockIndexBaseinfoExample example);

    int updateByExample(@Param("record") StockIndexBaseinfo record, @Param("example") StockIndexBaseinfoExample example);

    int updateByPrimaryKeySelective(StockIndexBaseinfo record);

    int updateByPrimaryKey(StockIndexBaseinfo record);
}