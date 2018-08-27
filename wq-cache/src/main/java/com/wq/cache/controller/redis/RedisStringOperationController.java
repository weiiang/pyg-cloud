package com.wq.cache.controller.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
 *Description:	Redis缓存服务 Set类型的API
 *
 */
@Api(value="Redis服务List类型API")
@RestController
@RequestMapping("/cache/redis")
public class RedisStringOperationController {
	
	@Autowired
	private RedisUtils redisUtils;
	
	//-----------------------------------------String类型API--------------------------------------------------------------
		@ApiOperation(value="根据key获取缓存", notes="参数说明:key为键,返回Object类型value")
		@GetMapping("/string")
		public ResponseEntity<Object> get(@RequestParam(value="key", required=true)String key){ 
			return ResponseEntity.ok(redisUtils.get(key));
		}
		
		@ApiOperation(value="根据key和value设置缓存", notes="参数说明:key为String,value为Object类型")
		@PostMapping("/string")
		public ResponseEntity<Boolean> set(@RequestParam(value="key", required=true)String key,
				@RequestBody(required = true) Object value){ 
			return ResponseEntity.ok(redisUtils.set(key,value));
		}
		
		@ApiOperation(value="根据key,value,time设置缓存,并设置过期时间", notes="参数说明:key为String,value为Object类型,time为long类型的毫秒数")
		@PostMapping("/string-time")
		public ResponseEntity<Boolean> set(@RequestParam(value="key", required=true)String key,
				@RequestParam(value="time", required=true)long time,
				@RequestBody(required = true) Object value){ 
			return ResponseEntity.ok(redisUtils.set(key,value,time));
		}
		
		@ApiOperation(value="根据key,delta递增", notes="参数说明:key为String,delta为long类型且不必须大于0")
		@PutMapping("/string-adjunction")
		public ResponseEntity<Long> incre(@RequestParam(value="key", required=true)String key,
				@RequestParam(value="delta", required=true)long delta){
			return ResponseEntity.ok(redisUtils.incr(key,delta));
		}
		
		@ApiOperation(value="根据key,delta递减", notes="参数说明:key为String,delta为long类型且不必须大于0")
		@PutMapping("/string-reduction")
		public ResponseEntity<Long> decr(@RequestParam(value="key", required=true)String key,
				@RequestParam(value="delta", required=true)long delta){
			return ResponseEntity.ok(redisUtils.decr(key,delta));
		}
}

