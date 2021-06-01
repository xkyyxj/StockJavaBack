package com.cassiopeia.stock.mapper;

import com.cassiopeia.stock.beans.StockBaseInfo;
import com.cassiopeia.stock.beans.StockBaseInfoExample;
import com.cassiopeia.stock.beans.StockBaseInfoKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StockBaseInfoMapper {
    long countByExample(StockBaseInfoExample example);

    int deleteByExample(StockBaseInfoExample example);

    int deleteByPrimaryKey(StockBaseInfoKey key);

    int insert(StockBaseInfo record);

    int insertSelective(StockBaseInfo record);

    List<StockBaseInfo> selectByExample(StockBaseInfoExample example);

    StockBaseInfo selectByPrimaryKey(StockBaseInfoKey key);

    int updateByExampleSelective(@Param("record") StockBaseInfo record, @Param("example") StockBaseInfoExample example);

    int updateByExample(@Param("record") StockBaseInfo record, @Param("example") StockBaseInfoExample example);

    int updateByPrimaryKeySelective(StockBaseInfo record);

    int updateByPrimaryKey(StockBaseInfo record);

    String queryLastDay();

    void batchInsert(List<StockBaseInfo> list);
}