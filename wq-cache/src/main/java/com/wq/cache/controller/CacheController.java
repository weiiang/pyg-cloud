package com.wq.cache.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wq.cache.util.RedisUtils;

/**
 *author: 		wq
 *datetime: 	2018年8月27日	下午12:42:46
 *E-mail:		1432114216@qq.com
 *blog:			https://blog.csdn.net/weiqiang2
 *Description:	Redis缓存服务层
 *
 */
@RestController
@RequestMapping("/cache")
public class CacheController {
	@SuppressWarnings("unused")
	@Autowired
	private RedisUtils redisUtils;
	
	
	
	
}

