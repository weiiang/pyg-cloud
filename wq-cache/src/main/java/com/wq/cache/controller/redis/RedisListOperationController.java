package com.wq.cache.controller.redis;

import java.util.List;

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
public class RedisListOperationController {
	
	@Autowired
	private RedisUtils redisUtils;
	
	@ApiOperation(value="将Object放入缓存", 
			notes="参数说明:key->键;value->Object类型的值")
	@PostMapping("/list")
	public ResponseEntity<Boolean> lSet(@RequestParam(value="key", required=true)String key,
			@RequestBody(required = true)Object value){
		return ResponseEntity.ok(redisUtils.lSet(key,value));
	}
	
	@ApiOperation(value="将Object放入缓存,并设置过期时间", 
			notes="参数说明:key->键;value->Object类型的值;time->过期时间")
	@PostMapping("/list-time")
	public ResponseEntity<Boolean> lSet(@RequestParam(value="key", required=true)String key,
			@RequestBody(required = true)Object value,
			@RequestParam(value="time", required=true)long time){
		return ResponseEntity.ok(redisUtils.lSet(key,value,time));
	}
	
	@ApiOperation(value="将list放入缓存", 
			notes="参数说明:key->键;value->Object类型的值")
	@PostMapping("/list-list")
	public ResponseEntity<Boolean> lSet(@RequestParam(value="key", required=true)String key,
			@RequestBody(required = true)List<Object> value){
		return ResponseEntity.ok(redisUtils.lSet(key,value));
	}
	
	@ApiOperation(value="将list放入缓存;并设置过期时间", 
			notes="参数说明:key->键;value->Object类型的值;time:long类型的毫秒数")
	@PostMapping("/list-list-time")
	public ResponseEntity<Boolean> lSet(@RequestParam(value="key", required=true)String key,
			@RequestBody(required = true)List<Object> value,
			@RequestParam(value="time", required=true)long time){
		return ResponseEntity.ok(redisUtils.lSet(key,value,time));
	}
	
	@ApiOperation(value="移除N个值为value的项", 
			notes="参数说明:key->键;count->个数;value->Object类型的值")
	@DeleteMapping("/list")
	public ResponseEntity<Long> lRemove(@RequestParam(value="key", required=true)String key,
			@RequestParam(value="count", required = true)long count,
			@RequestBody(required = true)Object value){
		return ResponseEntity.ok(redisUtils.lRemove(key,count,value));
	}
	
	@ApiOperation(value="获取list缓存的内容", 
			notes="参数说明:key->键;start->开始的索引;end->结束的索引;0到-1返回所有值;返回类型List<Object>")
	@GetMapping("/list")
	public ResponseEntity<List<Object>> sDecr(@RequestParam(value="key", required=true)String key,
			@RequestParam(value="start", required = false)long start, 
			@RequestParam(value="end", required = false)long end){
		return ResponseEntity.ok(redisUtils.lGet(key, start, end));
	}
	
	@ApiOperation(value="通过索引 获取list中的值", 
			notes="参数说明:key->键;index->索引;"
					+ "索引 index>=0时， 0 表头，1 第二个元素，依次类推；index<0时，-1，表尾，-2倒数第二个元素，依次类推;返回Object")
	@GetMapping("/list-index")
	public ResponseEntity<Object> lGetIndex(@RequestParam(value="key", required=true)String key,
			@RequestParam(value="index", required = true)long index){
		return ResponseEntity.ok(redisUtils.lGetIndex(key, index));
	}
	
	@ApiOperation(value="获取list缓存的长度", 
			notes="参数说明:key->键;返回list长度")
	@GetMapping("/list-length")
	public ResponseEntity<Long> lGetListSize(@RequestParam(value="key", required=true)String key){
		return ResponseEntity.ok(redisUtils.lGetListSize(key));
	}
	
	
	@ApiOperation(value="根据索引修改list中的某条数据", 
			notes="参数说明:key->键;index->索引;value->Object类型的值")
	@PutMapping("/list")
	public ResponseEntity<Boolean> lUpdateIndex(@RequestParam(value="key", required=true)String key,
			@RequestParam(value="index", required = false)long index,
			@RequestBody(required = true)Object value){
		return ResponseEntity.ok(redisUtils.lUpdateIndex(key,index,value));
	}
}

