package com.serpent.stock.service.intimeana;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AnalyzerEntrance {

    // 启动一个新线程做分析工作
    @Async
    public void doAnalyze() {

    }

}
