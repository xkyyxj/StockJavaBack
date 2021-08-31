package com.serpent.stock.analyzer.statistic;

import com.serpent.stock.analyzer.BaseAnalyzer;
import io.netty.util.Timeout;

import java.util.concurrent.TimeUnit;

public class SimulateBuyStatistic extends BaseAnalyzer {
    @Override
    public void run(Timeout timeout) throws Exception {
        // TODO -- finish this function
        timer.newTimeout(this, 24, TimeUnit.HOURS);
    }
}
