package com.serpent.stock.calculator;

import com.serpent.stock.dao.StockBaseInfoDAO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class CalculatorDispatcher {

    private final StockBaseInfoDAO baseInfoDAO;
    private final ExecutorService executorService;

    public CalculatorDispatcher(StockBaseInfoDAO baseInfoDAO, @Qualifier("defaultExecutor") ExecutorService executorService) {
        this.baseInfoDAO = baseInfoDAO;
        this.executorService = executorService;
    }

    /**
     * 计算逻辑，计算得出结果并且存储到数据库当中
     * @param calculator: 真正的计算逻辑实现类
     * FIXME - 1. 如果重复计算的话如何处理 2. 第一次计算没有完成的时候又开始新一轮计算
     * */
    public void startCalculate(ICalculator calculator) {
        // 第一步：获取所有的股票列表
        final List<String> tsCodes = baseInfoDAO.getAllStockListCode();
        // 第二步: 通过一个计数器来做索引
        AtomicInteger index = new AtomicInteger(0);
        int threadNum = Runtime.getRuntime().availableProcessors();
        for(int i = 0;i < threadNum * 2;i++) {
            executorService.submit(() -> {
                int targetIndex = index.getAndAdd(1);
                String ts_code = tsCodes.get(targetIndex);
                calculator.calculate(ts_code);
            });
        }
    }

}
