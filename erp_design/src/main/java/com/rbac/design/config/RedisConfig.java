package com.rbac.design.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @author joker_dj
 * @create 2020-04-24日 9:23
 */
@Configuration
public class RedisConfig {
    @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory connectionFactory) {
        //创建redis的模板对象
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<String, Object>();
        //关联的redis数据库
        redisTemplate.setConnectionFactory(connectionFactory);
        //为key设置序列化
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        //为value设置序列化
        redisTemplate.setValueSerializer(new StringRedisSerializer());
        return redisTemplate;
    }
}
