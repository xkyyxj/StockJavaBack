package com.serpent.stock.dao;

import com.serpent.stock.beans.StockBaseInfo;
import com.serpent.stock.mapper.StockBaseInfoMapper;
import com.serpent.stock.mapper.StockListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.List;

@Component
public class StockBaseInfoDAO {

    @Autowired
    StockBaseInfoMapper baseInfoMapper;

    @Autowired
    StockListMapper listMapper;

    public String queryBaseInfoLastDay() {
        String lastDay = baseInfoMapper.queryLastDay();
        return !StringUtils.hasLength(lastDay) ? "" : lastDay;
    }

    public List<StockBaseInfo> getLastInfoOfDays(String ts_code, int days) {
        List<StockBaseInfo> retBaseInfos = baseInfoMapper.queryLastFewDayInfo(ts_code, days);
        return null;
    }

    public List<String> getAllStockListCode() {
        return listMapper.selectAllTsCodes();
    }

}
