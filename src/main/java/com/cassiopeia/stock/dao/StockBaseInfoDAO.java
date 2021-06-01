package com.cassiopeia.stock.dao;

import com.cassiopeia.stock.beans.StockBaseInfo;
import com.cassiopeia.stock.beans.StockBaseInfoExample;
import com.cassiopeia.stock.mapper.StockBaseInfoMapper;
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
