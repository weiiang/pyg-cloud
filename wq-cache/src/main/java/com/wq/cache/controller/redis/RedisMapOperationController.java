package com.wq.cache.controller.redis;

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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 *author: 		wq
 *datetime: 	2018年8月27日	下午5:11:26
 *E-mail:		1432114216@qq.com
 *blog:			https://blog.csdn.net/weiqiang2
 *Description:	Redis缓存服务 Map类型的API
 *
 */
@Api(value="Redis服务List类型API")
@RestController
@RequestMapping("/cache/redis")
public class RedisMapOperationController {
	
	@Autowired
	private RedisUtils redisUtils;
	

	//-----------------------------------------------Map类型API---------------------------------------------------------------
	
	@ApiOperation(value="根据key,item获取Hash类型的值", notes="参数说明:key为String,item为String类型")
	@GetMapping("/map")
	public ResponseEntity<Object> hget(@RequestParam(value="key", required=true)String key,
			@RequestParam(value="item", required=true)String item){
		return ResponseEntity.ok(redisUtils.hget(key,item));
	}
	
	@ApiOperation(value="根据key,item,设置Hash值为value", notes="参数说明:key为String,map为Map类型")
	@PostMapping("/map-map")
	public ResponseEntity<Boolean> hset(@RequestParam(value="key", required=true)String key,
			@RequestParam(value="map", required=true)Map<String, Object> map){
		return ResponseEntity.ok(redisUtils.hmset(key,map));
	}
	
	@ApiOperation(value="根据key,item,设置Hash值为value,并设置缓存过期事件", notes="参数说明:key为String,map为Map类型,time为long类型的毫秒")
	@PostMapping("/map-map-time")
	public ResponseEntity<Boolean> hset(@RequestParam(value="key", required=true)String key,
			@RequestParam(value="map", required=true)Map<String, Object> map,
			@RequestParam(value = "time")long time){
		return ResponseEntity.ok(redisUtils.hmset(key,map,time));
	}
	
	@ApiOperation(value="向一张hash表中放入数据,如果不存在将创建;根据key,item,设置Hash值为value",
			notes="参数说明:key为String,item为String类型,value为Object类型")
	@PostMapping("/map-hash")
	public ResponseEntity<Boolean> hset(@RequestParam(value="key", required=true)String key,
			@RequestParam(value="item", required=true)String item,
			@RequestBody(required = true)Object value){
		return ResponseEntity.ok(redisUtils.hset(key,item,value));
	}
	
	@ApiOperation(value="向一张hash表中放入数据,如果不存在将创建;"
			+ "根据key,item,设置Hash值为value,并设置过期时间", 
			notes="参数说明:key为String,item为String类型,value为Object类型,time为long类型的毫秒;"
					+ "时间(秒) 注意:如果已存在的hash表有时间,这里将会替换原有的时间")
	@PostMapping("/map-hash-time")
	public ResponseEntity<Boolean> hset(@RequestParam(value="key", required=true)String key,
			@RequestParam(value="item", required=true)String item,
			@RequestBody(required = true)Object value,
			@RequestParam(value = "time", required = true)long time){
		return ResponseEntity.ok(redisUtils.hset(key,item,value,time));
	}
	
	@ApiOperation(value="删除hash表中的值;key不能为null", 
			notes="参数说明:key为String,item为Object类型可以是多个item;")
	@DeleteMapping("/map-hash")
	public ResponseEntity<Boolean> hdel(@RequestParam(value="key", required=true)String key,
			@RequestParam(value="item", required=true)Object... item){
		return ResponseEntity.ok(redisUtils.hdel(key,item));
	}
	
	@ApiOperation(value="判断hash表中是否有该项的值", 
			notes="参数说明:key和item都不能为null")
	@GetMapping("/map-key")
	public ResponseEntity<Boolean> hHasKey(@RequestParam(value="key", required=true)String key,
			@RequestParam(value="item", required=true)String item){
		return ResponseEntity.ok(redisUtils.hHasKey(key,item));
	}
	
	@ApiOperation(value="hash递增 如果不存在,就会创建一个 并把新增后的值返回", 
			notes="参数说明:key->捡;item->项;by->增加多少;返回增加后的值")
	@PutMapping("/map-adjunction")
	public ResponseEntity<Double> hHasIncr(@RequestParam(value="key", required=true)String key,
			@RequestParam(value="item", required=true)String item,
			@RequestParam(value="by", required=true)double by){
		return ResponseEntity.ok(redisUtils.hincr(key,item,by));
	}
	
	@ApiOperation(value="hash递减 如果不存在,就会创建一个 并把较少后的值返回", 
			notes="参数说明:key->捡;item->项;by->增加多少;返回增加后的值")
	@PutMapping("/map-reduction")
	public ResponseEntity<Double> hDecr(@RequestParam(value="key", required=true)String key,
			@RequestParam(value="item", required=true)String item,
			@RequestParam(value="by", required=true)double by){
		return ResponseEntity.ok(redisUtils.hdecr(key,item,by));
	}
	
	
}

