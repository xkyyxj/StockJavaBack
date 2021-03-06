package com.serpent.stock.mapper;

import com.serpent.stock.beans.AdjFactor;
import com.serpent.stock.beans.AdjFactorExample;
import com.serpent.stock.beans.AdjFactorKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdjFactorMapper {
    long countByExample(AdjFactorExample example);

    int deleteByExample(AdjFactorExample example);

    int deleteByPrimaryKey(AdjFactorKey key);

    int insert(AdjFactor record);

    int insertSelective(AdjFactor record);

    List<AdjFactor> selectByExample(AdjFactorExample example);

    AdjFactor selectByPrimaryKey(AdjFactorKey key);

    int updateByExampleSelective(@Param("record") AdjFactor record, @Param("example") AdjFactorExample example);

    int updateByExample(@Param("record") AdjFactor record, @Param("example") AdjFactorExample example);

    int updateByPrimaryKeySelective(AdjFactor record);

    int updateByPrimaryKey(AdjFactor record);

    void batchInsert(List<AdjFactor> list);
}