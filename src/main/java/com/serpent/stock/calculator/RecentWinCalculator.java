package com.serpent.stock.calculator;

import com.serpent.config.StockCalculatorConfig;
import com.serpent.stock.beans.RecentMaxWin;
import com.serpent.stock.beans.StockBaseInfo;
import com.serpent.stock.dao.StockBaseInfoDAO;
import com.serpent.stock.mapper.RecentMaxWinMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("recentWinCalculator")
public class RecentWinCalculator implements ICalculator {

    private final StockBaseInfoDAO baseInfoDAO;
    private final RecentMaxWinMapper maxWinMapper;

    public RecentWinCalculator(StockBaseInfoDAO baseInfoDAO, RecentMaxWinMapper maxWinMapper) {
        this.baseInfoDAO = baseInfoDAO;
        this.maxWinMapper = maxWinMapper;
    }

    public void calculate(String ts_code) {
        // 第二步：计算相应的最近几天的盈利百分比并进行排序
        // 第2.1步：查询对应的基本信息，根据StockCalculatorConfig类的maxWinCalculateDays天数查询出来
        int calculateDays = StockCalculatorConfig.getMaxWinCalculateDays();
        // FIXME -- 此处可以考虑只查询收盘价
        List<StockBaseInfo> baseInfos = baseInfoDAO.getLastInfoOfDays(ts_code, calculateDays);

        // 计算结果
        double lastDayClose = baseInfos.get(0).getClose();
        double firstDayClose = baseInfos.get(baseInfos.size()).getClose();
        double winPct = (lastDayClose - firstDayClose) / firstDayClose;
        // 第三步：将结果回写到最终的结果列表当中去
        RecentMaxWin maxWin = new RecentMaxWin();
        maxWin.setWinPct(winPct);
        maxWin.setInDate(baseInfos.get(0).getTradeDate());
        maxWin.setFirstClose(firstDayClose);
        maxWin.setLastClose(lastDayClose);
        maxWin.setPeriod(baseInfos.size());
        maxWinMapper.insert(maxWin);
    }

}
