package com.cassiopeia.stock.controller;

import com.cassiopeia.stock.beans.StockBaseInfo;
import com.cassiopeia.stock.beans.StockBaseInfoExample;
import com.cassiopeia.stock.dto.QueryInfo;
import com.cassiopeia.stock.mapper.StockBaseInfoMapper;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/stockInfo")
public class StockInfoQueryController {

    final StockBaseInfoMapper baseInfoMapper;

    public StockInfoQueryController(StockBaseInfoMapper mapper) {
        baseInfoMapper = mapper;
    }

    @CrossOrigin
    @RequestMapping("/baseInfo")
    public List<StockBaseInfo> queryStockBaseInfo(@RequestBody QueryInfo info) {
        StockBaseInfoExample example = new StockBaseInfoExample();
        StockBaseInfoExample.Criteria criteria = example.createCriteria();
        if(StringUtils.hasLength(info.getTs_code())) {
            criteria.andTsCodeEqualTo(info.getTs_code());
        }
        if(StringUtils.hasLength(info.getBegin_date())) {
            criteria.andTradeDateGreaterThanOrEqualTo(info.getBegin_date());
        }
        if(StringUtils.hasLength(info.getEnd_date())) {
            criteria.andTradeDateLessThanOrEqualTo(info.getEnd_date());
        }
        return criteria.isValid() ? baseInfoMapper.selectByExample(example) : new ArrayList<>();
    }

}
