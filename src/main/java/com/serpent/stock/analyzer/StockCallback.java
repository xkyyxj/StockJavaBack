package com.serpent.stock.analyzer;

/**
 * 实时分析程序给出结果的时候，调用该回调函数将结果通知客户
 */
public interface StockCallback {
    void callback(StockCallbackInfo info);
}
