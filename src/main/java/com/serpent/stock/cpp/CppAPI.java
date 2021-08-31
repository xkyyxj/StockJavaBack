package com.serpent.stock.cpp;

import com.serpent.stock.analyzer.StockCallback;
import com.serpent.stock.analyzer.StockCallbackInfo;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 */
public class CppAPI {

    private final List<StockCallback> callbackList;

    public CppAPI() {
        callbackList = new CopyOnWriteArrayList<>();
    }

    public native void persistRef();

    public native void releaseRef();

    public native void startFetchTimeInfo();

    public native void startAnalyzer();

    public void addCallback(StockCallback callback) {
        callbackList.add(callback);
    }

    public void callback(StockCallbackInfo info) {
        for(StockCallback callback : callbackList) {
            callback.callback(info);
        }
    }

}
