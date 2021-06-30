package com.serpent.stock.controller;

import com.cassiopeia.rust.RustAPI;
import com.serpent.stock.calculator.CalculatorDispatcher;
import com.serpent.stock.calculator.ICalculator;
import com.serpent.stock.utils.BeanUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculate")
public class CalculateController {

    private final CalculatorDispatcher calculatorDispatcher;

    public CalculateController(CalculatorDispatcher calculatorDispatcher) {
        this.calculatorDispatcher = calculatorDispatcher;
    }

    @RequestMapping("/calculateHistoryDownSync")
    public boolean calculateHistoryDown() {
        RustAPI.calculateHistoryDownSync();
        return true;
    }

    @RequestMapping("/calculateRecentMaxWin/{calculatorType}")
    public void calculateRecentMaxWin(@PathVariable("calculatorType") String type) {
        // FIXME -- 如果前端传入参数错误，不能得到正确的calculator
        ICalculator realCalculator = (ICalculator) BeanUtils.getBeanByName(type);
        calculatorDispatcher.startCalculate(realCalculator);
    }

}
