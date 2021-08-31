package com.serpent.stock.dto;

import java.util.List;

public class TimeAnaInfo {

    // 当前方向 direction字段
    public static final int INIT = 0;
    public static final int UP = 1;
    public static final int DOWN = 2;

    // 波动类型 type字段
    public static final int INIT_T = 0;
    public static final int UP_T = 0;
    public static final int DOWN_T = 0;
    public static final int DOWN_UP = 0;
    public static final int UP_DOWN = 0;
    public static final int WAVE = 0;

    public static class KeyPoint {
        private double price;
        private Integer type;
        private double win_pct; // 当前的盈利百分比
        private String time;

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public Integer getType() {
            return type;
        }

        public void setType(Integer type) {
            this.type = type;
        }

        public double getWin_pct() {
            return win_pct;
        }

        public void setWin_pct(double win_pct) {
            this.win_pct = win_pct;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }

    private String ts_code;
    private Integer direction;
    private Integer type;
    private List<KeyPoint> key_points;

    public String getTs_code() {
        return ts_code;
    }

    public void setTs_code(String ts_code) {
        this.ts_code = ts_code;
    }

    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public List<KeyPoint> getKey_points() {
        return key_points;
    }

    public void setKey_points(List<KeyPoint> key_points) {
        this.key_points = key_points;
    }
}
