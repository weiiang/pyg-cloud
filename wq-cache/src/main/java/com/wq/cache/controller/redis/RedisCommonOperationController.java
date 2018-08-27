package com.wq.cache.controller.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wq.cache.util.RedisUtils;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 *author: 		wq
 *datetime: 	2018年8月27日	下午5:11:26
 *E-mail:		1432114216@qq.com
 *blog:			https://blog.csdn.net/weiqiang2
 *Description:	Redis缓存服务 公共API
 *
 */
@Api(value="Redis服务Common类型API")
@RestController
@RequestMapping("/cache/redis/common")
public class RedisCommonOperationController {
	
	@Autowired
	private RedisUtils redisUtils;
	
	@ApiOperation(value="根据key设置缓存的过期时间", notes="参数说明:key为键值,time为过期时间")
	@PutMapping("/expire")
	public ResponseEntity<Boolean> expire(@RequestParam(value="key", required=true)String key, 
			@RequestParam(value="time", required=true)long time){
		return ResponseEntity.ok(redisUtils.expire(key, time));
	}
	
	@ApiOperation(value="根据key获取缓存有效时间", notes="参数说明:key为键值,返回有效时间")
	@GetMapping("/expire-time")
	public ResponseEntity<Long> getExpire(@RequestParam(value="key", required=true)String key){
		return ResponseEntity.ok(redisUtils.getExpire(key));
	}
	
	@ApiOperation(value="判断key是否存在", notes="参数说明:key为键值,存在返回true,否则false")
	@GetMapping("/exist-key")
	public ResponseEntity<Boolean> hasKey(@RequestParam(value="key", required=true)String key){ 
		return ResponseEntity.ok(redisUtils.hasKey(key));
	}
	
	@ApiOperation(value="根据key删除缓存", notes="参数说明:keys可以是多个参数")
	@DeleteMapping("/keys")
	public ResponseEntity<Boolean> delKey(@RequestParam(value="keys", required=true)String...keys){ 
		return ResponseEntity.ok(redisUtils.del(keys));
	}
	
}

