package com.serpent.stock.calculator;

/**
 * 计算类的接口，现在不返回时数据，直接插入到数据库当中
 * */
public interface ICalculator {

    void calculate(String ts_code);

}
