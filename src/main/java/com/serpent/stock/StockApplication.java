package com.serpent.stock;

import com.cassiopeia.rust.RustAPI;
import com.serpent.stock.utils.BeanUtils;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.HashMap;

@SpringBootApplication(scanBasePackages = {"com.serpent.config", "com.serpent.stock.controller",
        "com.serpent.stock.dao", "com.serpent.stock.service", "com.serpent.stock.calculator"})
@MapperScan(basePackages = {"com.serpent.stock.mapper"})
public class StockApplication {

    static {
        System.loadLibrary("stock_py");
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(StockApplication.class, args);
        StringRedisTemplate stringRedisTemplate = context.getBean(StringRedisTemplate.class);        //往redis中存入数据
        BeanUtils.setContext(context);

        // 初始化Rust并开始获取实时信息，并计算相应的股票
        HashMap<Object,Object> configInfo = new HashMap<>();
        configInfo.put("mysql", "mysql://root:123@localhost:3306/stock");
        configInfo.put("redis", "redis://127.0.0.1/");
        RustAPI.initialize(configInfo);
        RustAPI.startTimeFetch();
    }

    public int numDecodings(String s) {
        int result = 0;
        return result;
    }

}
