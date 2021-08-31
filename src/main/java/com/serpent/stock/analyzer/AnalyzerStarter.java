package com.serpent.stock.analyzer;

import com.serpent.stock.analyzer.intime.CurrHoldAnalyzer;
import com.serpent.stock.analyzer.intime.SimulateBuyAnalyzer;
import com.serpent.stock.analyzer.intime.TwoDayInTimeAna;
import com.serpent.stock.analyzer.intime.VeryShortSimulateAnalyzer;
import io.netty.util.HashedWheelTimer;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * 实时分析程序的总入口
 */
@Component
public class AnalyzerStarter {

    private final HashedWheelTimer timer; // 单线程非阻塞？那样还挺好的
    private final CurrHoldAnalyzer holdAnalyzer;
    private final TwoDayInTimeAna twoDayInTimeAna;
    private final SimulateBuyAnalyzer simulateBuyAnalyzer;
    private final VeryShortSimulateAnalyzer shortSimulateAnalyzer;

    public AnalyzerStarter(CurrHoldAnalyzer holdAnalyzer, TwoDayInTimeAna twoDayInTimeAna,
                           SimulateBuyAnalyzer simulateBuyAnalyzer, VeryShortSimulateAnalyzer shortSimulateAnalyzer) {
        this.holdAnalyzer = holdAnalyzer;
        this.simulateBuyAnalyzer = simulateBuyAnalyzer;
        this.shortSimulateAnalyzer = shortSimulateAnalyzer;
        this.holdAnalyzer.appendCallback(new ConsoleCallback());
        this.twoDayInTimeAna = twoDayInTimeAna;
        this.twoDayInTimeAna.appendCallback(new ConsoleCallback());
        timer = new HashedWheelTimer();
        this.holdAnalyzer.setTimer(timer);
        this.twoDayInTimeAna.setTimer(timer);
        this.simulateBuyAnalyzer.setTimer(timer);
        this.shortSimulateAnalyzer.setTimer(timer);
    }

    public void start() {
        timer.newTimeout(holdAnalyzer, 2, TimeUnit.SECONDS);
        timer.newTimeout(twoDayInTimeAna, 2, TimeUnit.SECONDS);
        timer.newTimeout(simulateBuyAnalyzer, 2, TimeUnit.SECONDS);
        timer.newTimeout(shortSimulateAnalyzer, 2, TimeUnit.SECONDS);
    }

}
