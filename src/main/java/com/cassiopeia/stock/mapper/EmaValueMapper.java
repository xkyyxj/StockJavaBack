package com.cassiopeia.stock.mapper;

import com.cassiopeia.stock.beans.EmaValue;
import com.cassiopeia.stock.beans.EmaValueExample;
import com.cassiopeia.stock.beans.EmaValueKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmaValueMapper {
    long countByExample(EmaValueExample example);

    int deleteByExample(EmaValueExample example);

    int deleteByPrimaryKey(EmaValueKey key);

    int insert(EmaValue record);

    int insertSelective(EmaValue record);

    List<EmaValue> selectByExample(EmaValueExample example);

    EmaValue selectByPrimaryKey(EmaValueKey key);

    int updateByExampleSelective(@Param("record") EmaValue record, @Param("example") EmaValueExample example);

    int updateByExample(@Param("record") EmaValue record, @Param("example") EmaValueExample example);

    int updateByPrimaryKeySelective(EmaValue record);

    int updateByPrimaryKey(EmaValue record);
}