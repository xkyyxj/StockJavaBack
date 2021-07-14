package com.serpent.stock.utils;

import com.serpent.stock.dto.TimeInfo;

import java.util.ArrayList;

public class RedisUtils {

    /**
     * 单条信息的转换
     * @param str
     * @return
     */
    private TimeInfo convertSingleTimeInfo(String str) {
        String[] v = str.split(",");
        if(v.length != 26) {
            return null;
        }
        TimeInfo info = new TimeInfo();
        info.setTodayOpen(Double.parseDouble(v[0]));
        info.setLastClose(Double.parseDouble(v[1]));
        info.setCurrPrice(Double.parseDouble(v[2]));
        info.setTodayMaxPrice(Double.parseDouble(v[3]));
        info.setTodayMinPrice(Double.parseDouble(v[4]));
        for(int i = 0;i < 5;i++) {
            info.getBuyPrice()[i] = Double.parseDouble(v[5 + i]);
            info.getSoldPrice()[i] = Double.parseDouble(v[10 + i]);
            info.getBuyNum()[i] = Double.parseDouble(v[15 + i]);
            info.getSoldNum()[i] = Double.parseDouble(v[20 + i]);
        }
        info.setCurrTime(v[25]);
        return info;
    }

    /**
     * 将字符串转换成实时信息VO
     * @param str
     */
    public ArrayList<TimeInfo> convertStr2TimeInfo(String str) {
        ArrayList<TimeInfo> timeInfos = new ArrayList<>();
        int firstIndex = str.indexOf("~");
        if(firstIndex < str.length()) {
            String[] items = str.split("~");
            for(int i = 1;i < items.length;i++) {
                timeInfos.add(convertSingleTimeInfo(items[i]));
            }
        } else {
            // TODO -- 这种情况是不是要重新获取下？或者直接返回空的列表
        }
        return timeInfos;
    }

}
