package com.serpent.stock.dao.redis;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

@Component
public class RedisDAO {

    private final RedisTemplate redisTemplate;

    public RedisDAO(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    /**
     * */
    public Object getLatestIntimeInfo(String key, int num) {
        Object result = null;
        ValueOperations operations = redisTemplate.opsForValue();
        long keyLength = operations.size(key);
        long startIndex = keyLength - 400 * num;
        startIndex =  startIndex < 0 ? 0 : startIndex;
        result = operations.get(key, startIndex, keyLength);
        return result;
    }

}
