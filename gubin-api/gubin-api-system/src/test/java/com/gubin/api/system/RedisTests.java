package com.gubin.api.system;

import com.gubin.common.redis.service.RedisService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * redis测试类
 *
 * @author GuBin
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class RedisTests {


    private static final String TEST_REDIS_KEY = "test_redis_key";
    private static final Logger logger = LoggerFactory.getLogger(RedisTests.class);

    @Autowired
    private RedisService redisService;

    @Test
    public void setData() {
        redisService.setCacheObject(TEST_REDIS_KEY, "123456");
    }

    @Test
    public void getData() {
        logger.info("Redis取值测试:" + redisService.getCacheObject(TEST_REDIS_KEY));
    }
}
