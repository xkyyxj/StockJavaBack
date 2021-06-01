package com.cassiopeia.stock;

import com.cassiopeia.stock.utils.BeanUtils;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = {"com.cassiopeia.config", "com.cassiopeia.stock.controller",
        "com.cassiopeia.stock.dao", "com.cassiopeia.stock.service"})
@MapperScan(basePackages = {"com.cassiopeia.stock.mapper"})
public class StockApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(StockApplication.class, args);
        BeanUtils.setContext(context);
    }

    public int numDecodings(String s) {
        int result = 0;
        return result;
    }

}
