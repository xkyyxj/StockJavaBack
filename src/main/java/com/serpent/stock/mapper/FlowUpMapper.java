package com.serpent.stock.mapper;

import com.serpent.stock.beans.FlowUp;
import com.serpent.stock.beans.FlowUpExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FlowUpMapper {
    long countByExample(FlowUpExample example);

    int deleteByExample(FlowUpExample example);

    int deleteByPrimaryKey(Integer pkUp);

    int insert(FlowUp record);

    int insertSelective(FlowUp record);

    List<FlowUp> selectByExample(FlowUpExample example);

    FlowUp selectByPrimaryKey(Integer pkUp);

    int updateByExampleSelective(@Param("record") FlowUp record, @Param("example") FlowUpExample example);

    int updateByExample(@Param("record") FlowUp record, @Param("example") FlowUpExample example);

    int updateByPrimaryKeySelective(FlowUp record);

    int updateByPrimaryKey(FlowUp record);
}