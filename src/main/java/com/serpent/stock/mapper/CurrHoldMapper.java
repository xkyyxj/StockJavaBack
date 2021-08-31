package com.serpent.stock.mapper;

import com.serpent.stock.beans.CurrHold;
import com.serpent.stock.beans.CurrHoldExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CurrHoldMapper {
    long countByExample(CurrHoldExample example);

    int deleteByExample(CurrHoldExample example);

    int deleteByPrimaryKey(Integer pkCurrHold);

    int insert(CurrHold record);

    int insertSelective(CurrHold record);

    List<CurrHold> selectByExample(CurrHoldExample example);

    CurrHold selectByPrimaryKey(Integer pkCurrHold);

    int updateByExampleSelective(@Param("record") CurrHold record, @Param("example") CurrHoldExample example);

    int updateByExample(@Param("record") CurrHold record, @Param("example") CurrHoldExample example);

    int updateByPrimaryKeySelective(CurrHold record);

    int updateByPrimaryKey(CurrHold record);

    List<CurrHold> selectCurrHold();
}