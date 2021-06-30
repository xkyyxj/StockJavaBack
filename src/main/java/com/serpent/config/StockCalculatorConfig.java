package com.serpent.config;

public class StockCalculatorConfig {

    public static final int D_MAX_WIN_CALCULATE_DAY = 10;

    private static int maxWinCalculateDays = D_MAX_WIN_CALCULATE_DAY;

    public static int getMaxWinCalculateDays() {
        return maxWinCalculateDays;
    }

    public static void setMaxWinCalculateDays(int _maxWinCalculateDays) {
        maxWinCalculateDays = _maxWinCalculateDays;
    }
}
