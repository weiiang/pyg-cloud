package com.wq.cache.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wq.cache.util.RedisUtils;

/**
 *author: 		wq
 *datetime: 	2018年8月27日	下午12:38:39
 *E-mail:		1432114216@qq.com
 *blog:			https://blog.csdn.net/weiqiang2
 *Description:	Redis配置类
 *
 */
@Configuration
@EnableCaching
public class RedisConfig {
	private Logger logger = LoggerFactory.getLogger(RedisUtils.class);

	@Bean
	public RedisTemplate<String, Object> getRedisTemplate(RedisConnectionFactory factory){
		RedisTemplate<String, Object> redisTemplate = new RedisTemplate<String, Object>();
		redisTemplate.setConnectionFactory(factory);
		
		@SuppressWarnings({ "rawtypes", "unchecked" })
		Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
		objectMapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
		jackson2JsonRedisSerializer.setObjectMapper(objectMapper);
		StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
		//key序列化方式
		redisTemplate.setKeySerializer(stringRedisSerializer);
		//hash类型的key序列化方式
		redisTemplate.setHashKeySerializer(stringRedisSerializer);
		//value序列化方式jackson
		redisTemplate.setValueSerializer(jackson2JsonRedisSerializer);
		redisTemplate.setHashValueSerializer(jackson2JsonRedisSerializer);
		logger.info("注入redisTemplate:"+redisTemplate);
		redisTemplate.afterPropertiesSet();
		return redisTemplate;
	}
	
	@Bean
	public RedisUtils redisUtils(RedisTemplate<String, Object> redisTemplate){
		RedisUtils utils = new RedisUtils();
		utils.setRedisTemplate(redisTemplate);
		logger.info("注入RedisUtils:"+utils);
		return utils;
	}
}
