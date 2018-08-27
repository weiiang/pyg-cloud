package com.wq.cache.controller.redis;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
@Api(value="Redis服务Set类型API")
@RestController
@RequestMapping("/cache/redis")
public class RedisSetOperationController {
	
	@Autowired
	private RedisUtils redisUtils;
	
	@ApiOperation(value="根据key获取Set中的所有值", 
			notes="参数说明:key->键;返回类型Set<Object>")
	@GetMapping("/set")
	public ResponseEntity<Set<Object>> sDecr(@RequestParam(value="key", required=true)String key){
		return ResponseEntity.ok(redisUtils.sGet(key));
	}
	
	@ApiOperation(value="将数据放入set缓存,并设置时间", 
			notes="参数说明:key->键;values->每一项的值;返回成功放入的个数")
	@PostMapping("/set")
	public ResponseEntity<Long> sSet(@RequestParam(value="key", required=true)String key,
			@RequestBody(required=true)Object... values){
		return ResponseEntity.ok(redisUtils.sSet(key,values));
	}
	
	@ApiOperation(value="将数据放入set缓存,并设置过期时间", 
			notes="参数说明:key->键;values->每一项的值;time->long类型的过期时间;返回成功放入的个数")
	@PostMapping("/set-time")
	public ResponseEntity<Long> sSet(@RequestParam(value="key", required=true)String key,
			@RequestParam(value="key", required=true)long time,
			@RequestBody(required=true)Object... values){
		return ResponseEntity.ok(redisUtils.sSet(key,values,time));
	}
	
	@ApiOperation(value="移除值为value的项", 
			notes="参数说明:key->键;values->每一项的值,可以为多个值;返回成功移除的个数")
	@DeleteMapping("/set")
	public ResponseEntity<Long> setRemove(@RequestParam(value="key", required=true)String key,
			@RequestBody(required=true)Object... values){
		return ResponseEntity.ok(redisUtils.setRemove(key,values));
	}
	
	@ApiOperation(value="根据value从一个set中查询,是否存在", 
			notes="参数说明:key->键;value->值")
	@GetMapping("/set-key")
	public ResponseEntity<Boolean> hHasKey(@RequestParam(value="key", required=true)String key,
			@RequestBody(required=true)Object value){
		return ResponseEntity.ok(redisUtils.sHasKey(key, value));
	}
	
	@ApiOperation(value="获取set缓存的长度", 
			notes="参数说明:key->键;返回key长度")
	@GetMapping("/set-key-length")
	public ResponseEntity<Long> sGetSetSize(@RequestParam(value="key", required=true)String key){
		return ResponseEntity.ok(redisUtils.sGetSetSize(key));
	}
}

