package com.cn.bank.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @Auther: Administrator
 * @Date: 2018/11/27 10:44
 * @Description:
 */
@Configuration
@EnableAutoConfiguration
@PropertySource(value = { "classpath:redis.properties" })
public class RedisConfig extends CachingConfigurerSupport {

    @Value("${redis.database}")
    private int database;

    @Value("${redis.host}")
    private String hostName;

    @Value("${redis.port}")
    private int port;

    @Value("${redis.pass}")
    private String password;

    @Value("${redis.timeout}")
    private int timeout;

    @Value("${redis.maxIdle}")
    private int maxIdle;

    @Value("${redis.minIdle}")
    private int minIdle;

    @Value("${redis.maxTotal}")
    private int maxTotal;

    @Value("${redis.maxWaitMillis}")
    private long maxWaitMillis;

    @Value("${redis.testOnBorrow}")
    private boolean testOnBorrow;

    public JedisPoolConfig poolCofig(int maxIdle, int maxTotal,
                                     long maxWaitMillis, boolean testOnBorrow) {
        JedisPoolConfig poolCofig = new JedisPoolConfig();
        poolCofig.setMaxIdle(maxIdle);
        poolCofig.setMaxIdle(minIdle);
        poolCofig.setMaxTotal(maxTotal);
        poolCofig.setMaxWaitMillis(maxWaitMillis);
        poolCofig.setTestOnBorrow(testOnBorrow);
        return poolCofig;
    }

    @Bean
    public JedisConnectionFactory redisConnectionFactory() {
        JedisConnectionFactory factory = new JedisConnectionFactory();
        factory.setDatabase(database);
        factory.setHostName(hostName);
        factory.setPort(port);
        factory.setPassword(password);
        factory.setTimeout(timeout);

        factory.setPoolConfig(poolCofig(maxIdle, maxTotal, maxWaitMillis, testOnBorrow));
        // 初始化连接pool
        factory.afterPropertiesSet();

        return factory;
    }

    @Bean
    @Override
    public KeyGenerator keyGenerator() {
        return (target, method, objects) -> {
            StringBuilder sb = new StringBuilder();
            sb.append(target.getClass().getName());
            sb.append("::" + method.getName() + ":");
            for (Object obj : objects) {
                sb.append(obj.toString());
            }
            return sb.toString();
        };
    }

//	    @Bean
//	    public CacheManager cacheManager(@SuppressWarnings("rawtypes") RedisTemplate redisTemplate) {
//	        return new RedisCacheManager(redisTemplate);
//	    }

    @Bean
    public RedisTemplate<String, String> redisTemplate(
            RedisConnectionFactory factory) {
        StringRedisTemplate template = new StringRedisTemplate(factory);
        Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);
        ObjectMapper om = new ObjectMapper();
        //om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        jackson2JsonRedisSerializer.setObjectMapper(om);
        template.setValueSerializer(jackson2JsonRedisSerializer);
        template.afterPropertiesSet();
        return template;
    }

    @Bean
    public JedisPool getJedisPool() {
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(maxTotal);
        config.setMaxIdle(maxIdle);
        config.setMinIdle(minIdle);
        config.setTestOnBorrow(testOnBorrow);
        config.setTestOnReturn(false);
        config.setBlockWhenExhausted(true);
        config.setMaxWaitMillis(maxWaitMillis);
        JedisPool pool = new JedisPool(config, hostName, port, timeout, password);
        return pool;
    }
}
