package com.serpent.stock;

import com.serpent.stock.calculator.CalculatorDispatcher;
import com.serpent.stock.calculator.LongSleepWakeCalculator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;
import java.util.concurrent.ExecutionException;

@SpringBootTest
class StockApplicationTests {

    private final RedisTemplate template;
    @Resource
    private CalculatorDispatcher calculatorDispatcher;
    @Resource
    private LongSleepWakeCalculator longSleepWakeCalculator;

    StockApplicationTests(@Qualifier("stringRedisTemplate") RedisTemplate template) {
        this.template = template;
    }

    @Test
    void contextLoads() throws ExecutionException, InterruptedException {
        System.out.println(template.opsForValue().get("002326.SZ_j").toString());
//        calculatorDispatcher.startCalculate(longSleepWakeCalculator);
    }

}
