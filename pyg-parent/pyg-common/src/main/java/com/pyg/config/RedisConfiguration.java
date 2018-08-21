package com.pyg.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
@EnableCaching
public class RedisConfiguration extends CachingConfigurerSupport{
	
	private Logger logger = LoggerFactory.getLogger(RedisConfiguration.class);

	@Bean
	public CacheManager getCacheManager(RedisTemplate<?, ?> redisTemplate){
		CacheManager cacheManager = new RedisCacheManager(redisTemplate);
		return cacheManager;
	}
	
	@Bean
	public RedisTemplate<String, Object> getRedisTemplate(RedisConnectionFactory factory){
		logger.info("开始注入redistemplate......");
		RedisTemplate< String, Object> redisTemplate = new RedisTemplate<>();
		redisTemplate.setConnectionFactory(factory);
		
		RedisSerializer<?> stringSerializer = new StringRedisSerializer();
		redisTemplate.setKeySerializer(stringSerializer);
		logger.info("注入的redisTemplate:"+redisTemplate.toString());
		return redisTemplate;
	}
   
}