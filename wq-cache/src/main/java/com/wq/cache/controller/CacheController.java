package com.wq.cache.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wq.cache.util.RedisUtils;

import io.swagger.annotations.ApiOperation;

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
	@Autowired
	private RedisUtils redisUtils;
	
	
	
	
}

