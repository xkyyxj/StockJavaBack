package com.serpent.stock.calculator;

import com.serpent.stock.dao.StockBaseInfoDAO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 计算服务类，提供若干中计算逻辑？
 * TODO -- 002006那种从长久的横盘当中醒过来的股票， 可以考虑做一个长期持有，那么就要能够算出来
 */
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
    public void startCalculate(ICalculator calculator) throws ExecutionException, InterruptedException {
        // 第一步：获取所有的股票列表
        final List<String> tsCodes = baseInfoDAO.getAllStockListCode();
        // 第二步: 通过一个计数器来做索引
        AtomicInteger index = new AtomicInteger(0);
        int threadNum = Runtime.getRuntime().availableProcessors();
        Future<?>[] futures = new Future[threadNum * 2];
        for(int i = 0;i < threadNum * 2;i++) {
            futures[i] = executorService.submit(() -> {
                int targetIndex = 0;
                targetIndex = index.getAndAdd(1);
                while(targetIndex < tsCodes.size()) {
                    String ts_code = tsCodes.get(targetIndex);
                    calculator.calculate(ts_code);
                }
            });
        }
        for(int i = 0;i < threadNum * 2;i++) {
            futures[i].get();
        }
    }

}
