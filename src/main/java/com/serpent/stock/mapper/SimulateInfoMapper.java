package com.serpent.stock.mapper;

import com.serpent.stock.beans.SimulateInfo;
import com.serpent.stock.beans.SimulateInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SimulateInfoMapper {
    long countByExample(SimulateInfoExample example);

    int deleteByExample(SimulateInfoExample example);

    int deleteByPrimaryKey(Integer pkSimulate);

    int insert(SimulateInfo record);

    int insertSelective(SimulateInfo record);

    List<SimulateInfo> selectByExample(SimulateInfoExample example);

    SimulateInfo selectByPrimaryKey(Integer pkSimulate);

    int updateByExampleSelective(@Param("record") SimulateInfo record, @Param("example") SimulateInfoExample example);

    int updateByExample(@Param("record") SimulateInfo record, @Param("example") SimulateInfoExample example);

    int updateByPrimaryKeySelective(SimulateInfo record);

    int updateByPrimaryKey(SimulateInfo record);
}