package com.serpent.stock.analyzer;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 汇总来自各个选择策略选择出来的股票，在此处汇总
 */
public class SelectRstCenter {

    private ConcurrentHashMap<String, List<SingleSelectItem>> finalRst;

}
