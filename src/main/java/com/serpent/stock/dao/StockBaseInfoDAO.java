package com.serpent.stock.dao;

import com.serpent.stock.mapper.StockBaseInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class StockBaseInfoDAO {

    @Autowired
    StockBaseInfoMapper baseInfoMapper;

    public String queryBaseInfoLastDay() {
        String lastDay = baseInfoMapper.queryLastDay();
        return !StringUtils.hasLength(lastDay) ? "" : lastDay;
    }

}
