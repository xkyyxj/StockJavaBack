package com.serpent.stock.analyzer;

import io.netty.util.HashedWheelTimer;
import io.netty.util.TimerTask;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 所有分析的父类，基础设施提供者
 */
public abstract class BaseAnalyzer implements TimerTask {

    public static Integer HOLD = 0;
    public static Integer SOLD = 1;
    public static Integer BUY = 2;
    public static Integer NOTHING = 3;

    protected HashedWheelTimer timer;
    private final List<StockCallback> callbacks = new ArrayList<>();

    public List<StockCallback> getCallbacks() {
        return callbacks;
    }

    public void appendCallback(StockCallback callback) {
        callbacks.add(callback);
    }

    public void setTimer(HashedWheelTimer _timer) {
        this.timer = _timer;
    }

    // 转换成redis分析数据的值
    protected String convertCode2RedisKey(String code) {
        String retCode = "";
        if(code.contains("SZ")) {
            retCode = retCode + "sz" + code.substring(0, 6);
        } else {
            retCode = retCode + "sh" + code.substring(0, 6);
        }
        return retCode;
    }

    public void callback(StockCallbackInfo info) {
        for(StockCallback callback : callbacks) {
            callback.callback(info);
        }
    }

    public static class AnalyzeResult implements Comparator<AnalyzeResult> {
        public double score;    // 买入评分
        public String tsCode;   // 股票编码
        public int suggestType; // 推荐操作

        @Override
        public int compare(AnalyzeResult o1, AnalyzeResult o2) {
            if(o1.score == o2.score) {
                return 0;
            }
            return o1.score > o2.score ? 1 : -1;
        }
    }

}
