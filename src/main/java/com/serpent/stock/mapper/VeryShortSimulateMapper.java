package com.serpent.stock.mapper;

import com.serpent.stock.beans.VeryShortSimulate;
import com.serpent.stock.beans.VeryShortSimulateExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VeryShortSimulateMapper {
    long countByExample(VeryShortSimulateExample example);

    int deleteByExample(VeryShortSimulateExample example);

    int deleteByPrimaryKey(Integer pkShort);

    int insert(VeryShortSimulate record);

    int insertSelective(VeryShortSimulate record);

    List<VeryShortSimulate> selectByExample(VeryShortSimulateExample example);

    VeryShortSimulate selectByPrimaryKey(Integer pkShort);

    int updateByExampleSelective(@Param("record") VeryShortSimulate record, @Param("example") VeryShortSimulateExample example);

    int updateByExample(@Param("record") VeryShortSimulate record, @Param("example") VeryShortSimulateExample example);

    int updateByPrimaryKeySelective(VeryShortSimulate record);

    int updateByPrimaryKey(VeryShortSimulate record);

    List<String> queryDayInfos(@Param("num") int nums);

    List<VeryShortSimulate> queryBeforeNoSoldInfos(@Param("inTime")String inTime);
}