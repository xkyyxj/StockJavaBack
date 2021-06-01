package com.cassiopeia.stock.service;

import com.cassiopeia.stock.beans.HistoryDownExample;
import com.cassiopeia.stock.mapper.HistoryDownMapper;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.HashMap;

@Component
public class FetchDataService {

    final HistoryDownMapper historyDownMapper;

    public FetchDataService(HistoryDownMapper historyDownMapper) {
        this.historyDownMapper = historyDownMapper;
    }

    public Object fetchData(String tableName, HashMap<String, String> param) {
        if(!StringUtils.hasText(tableName)) {
            return null;
        }

        Object retValue = null;
        switch(tableName) {
            case "history_down":
                retValue = queryHistoryDown(param);
                break;
            case "":
                break;
            default:
                break;
        }
        return retValue;
    }

    private Object queryHistoryDown(HashMap<String, String> param) {
        HistoryDownExample example = new HistoryDownExample();
        HistoryDownExample.Criteria criteria = example.createCriteria();
        String inDate = param.getOrDefault("in_date", "20210101");
        criteria.andInDateGreaterThan(inDate);
        return historyDownMapper.selectByExample(example);
    }

}
