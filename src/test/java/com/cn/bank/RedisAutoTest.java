package com.cn.bank;

import com.cn.bank.model.Bank;
import com.cn.bank.redis.RedisService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther: HuangShiXing
 * @Date: 2018/11/29 09:34
 * @Description:
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class RedisAutoTest {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private RedisService redisService;
    @Test
    public void save(){

        stringRedisTemplate.opsForValue().set("zzp","big z");
        Assert.assertEquals("big z",stringRedisTemplate.opsForValue().get("zzp"));
    }



    @Test
    public void testobjSerializer() throws InterruptedException {


    }
}