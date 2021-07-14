package com.serpent.stock.service.intimeana;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * 实时数据分析功能，动态分析股票数据，然后计算是否买入
 */
@Service
public class AnalyzerEntrance {

    // 启动一个新线程做分析工作
    @Async
    public void doAnalyze() {

    }

}
