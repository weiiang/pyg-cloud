package com.wq.cache.util;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.util.CollectionUtils;
/**
 *author: 		wq
 *datetime: 	2018年8月27日	下午12:38:39
 *E-mail:		1432114216@qq.com
 *blog:			https://blog.csdn.net/weiqiang2
 *Description:	
 *
 */
public class RedisUtils {
	
	private Logger logger = LoggerFactory.getLogger(RedisUtils.class);
	
	private  RedisTemplate<String, Object> redisTemplate;
	
	public  RedisTemplate<String, Object> getRedisTemplate() {
		return redisTemplate;
	}

	public  void setRedisTemplate(RedisTemplate<String, Object> redisTemplate) {
		this.redisTemplate = redisTemplate;
	}

	//---------------------------------------------------时间设置/删除方法--------------------------------------------------------
	/**
	 * 根据Key指定缓存失效的时间
	 * @param key
	 * @param time	失效时间,单位:毫秒
	 * @return
	 */
	public boolean expire(String key, long time){
		try{
			if(time >0){
				this.redisTemplate.expire(key, time, TimeUnit.SECONDS);
			}
		}catch(Exception e){
			e.printStackTrace();
			logger.error("redis设置 "+key+" 的缓存时间失败..."+e.getMessage());
			return false;
		}
		return true;
	}
	
	/**
	 * 根据key获取指定的缓存时间
	 * @param key
	 * @return	返回 0 代表长期有效, 返回 -1 表示获取失败
	 */
	public long getExpire(String key){
		if(key.trim() != null && key.trim() != "" ){
			return -1;
		}
		try {
			 return this.redisTemplate.getExpire(key);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("redis获取"+key+" 的缓存时间失败..."+e.getMessage());
			return -1;
		}
	}
	
	/**
	 * 判断key是否存在
	 * @param key
	 * @return 存在返回true,不存在则返回false
	 */
	public boolean hasKey(String key){
		try {
			return this.redisTemplate.hasKey(key);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("redis判断"+key+" 是否存在失败..."+e.getMessage());
			return false;
		}
	}
	
	/**
	 * 根据传来的key删除缓存,可以是一个key,也可以十多个
	 * @param key 
	 */
	@SuppressWarnings("unchecked")
	public boolean del(String...keys){
		try {
			if(keys.length > 0){
				if(keys.length == 1){
					this.redisTemplate.delete(keys[0]);
					return true;
				}else{
					this.redisTemplate.delete(CollectionUtils.arrayToList(keys));
					return true;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("redis删除"+keys+" 失败..."+e.getMessage());
			return false;
		}
		return false;
	}
	
	
	//--------------------------------------------------String类型的操作------------------------------------------------------------
	/**
	 * 获取缓存
	 * @param key
	 * @return	当key为空的时候返回null
	 */
	public Object get(String key){
		try {
			return key == null ? null : this.redisTemplate.opsForValue().get(key);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("redis获取"+key+" 的值失败..."+e.getMessage());
			return null;
		}
	}
	
	
	/**
	 * 普通设置缓存值 String<->Object
	 * @param key	键
	 * @param value	值
	 */
	public boolean set(String key, Object value){
		try {
			this.redisTemplate.opsForValue().set(key, value);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("redis设置值失败..."+e.getMessage());
			return false;
		}
	}
	
	/**
	 * 普通缓存放入并设置时间
	 * @param key 键	String
	 * @param value	值	Object
	 * @param time	毫秒数  缓存时间
	 * @return
	 */
	public boolean set(String key, Object value, long time){
		try {
			this.redisTemplate.opsForValue().set(key, value, time);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("redis设置 "+key+" 值失败..."+e.getMessage());
			return false;
		}
	}
	
	/**
	 * 递增
	 * 
	 * @param key
	 *            键
	 * @param delta
	 *            要增加几(大于0)
	 * @return 失败返回 -1 成功返回增加之后的值
	 */
	public long incr(String key, long delta) {
		if (delta < 0) {
			throw new RuntimeException("递增因子必须大于0");
		}
		try {
			return redisTemplate.opsForValue().increment(key, delta);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("redis递增 "+key+" 值失败..."+e.getMessage());
			return -1;
		}
	}

	/**
	 * 递减
	 * 
	 * @param key
	 *            键
	 * @param delta
	 *            要减少几(小于0)
	 * @return 	成功返回递减之后的值,失败返回 -1
	 */
	public long decr(String key, long delta) {
		if (delta < 0) {
			throw new RuntimeException("递减因子必须大于0");
		}
		try {
			return redisTemplate.opsForValue().increment(key, -delta);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("redis递减 "+key+" 值失败..."+e.getMessage());
			return -1;
		}
	}


	//----------------------------------------------------Map类型的操作-----------------------------------------------------------
	/**
	 * HashGet
	 * 
	 * @param key
	 *            键 不能为null
	 * @param item
	 *            项 不能为null
	 * @return 值
	 */
	public Object hget(String key, String item) {
		if(key == "" || key == null){
			throw new RuntimeException("Key不能为null...");
		}
		if(item == "" || item == null){
			throw new RuntimeException("item不能为null...");
		}
		try {
			return redisTemplate.opsForHash().get(key, item);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("redis获取 "+key+"---"+item+"值失败..."+e.getMessage());
			return null;
		}
	}

	/**
	 * HashSet
	 * 
	 * @param key
	 *            键
	 * @param map
	 *            对应多个键值
	 * @return true 成功 false 失败
	 */
	public boolean hmset(String key, Map<String, Object> map) {
		try {
			redisTemplate.opsForHash().putAll(key, map);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("redis设置 "+key+"---"+map+"值失败..."+e.getMessage());
			return false;
		}
	}

	/**
	 * HashSet 并设置时间
	 * 
	 * @param key
	 *            键
	 * @param map
	 *            对应多个键值
	 * @param time
	 *            时间(秒)
	 * @return true成功 false失败
	 */
	public boolean hmset(String key, Map<String, Object> map, long time) {
		try {
			redisTemplate.opsForHash().putAll(key, map);
			if (time > 0) {
				expire(key, time);
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * 向一张hash表中放入数据,如果不存在将创建
	 * 
	 * @param key
	 *            键
	 * @param item
	 *            项
	 * @param value
	 *            值
	 * @return true 成功 false失败
	 */
	public boolean hset(String key, String item, Object value) {
		try {
			redisTemplate.opsForHash().put(key, item, value);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * 向一张hash表中放入数据,如果不存在将创建
	 * 
	 * @param key
	 *            键
	 * @param item
	 *            项
	 * @param value
	 *            值
	 * @param time
	 *            时间(秒) 注意:如果已存在的hash表有时间,这里将会替换原有的时间
	 * @return true 成功 false失败
	 */
	public boolean hset(String key, String item, Object value, long time) {
		try {
			redisTemplate.opsForHash().put(key, item, value);
			if (time > 0) {
				expire(key, time);
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * 删除hash表中的值
	 * 
	 * @param key
	 *            键 不能为null
	 * @param item
	 *            项 可以使多个 不能为null
	 */
	public boolean hdel(String key, Object... item) {
		try {
			redisTemplate.opsForHash().delete(key, item);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * 判断hash表中是否有该项的值
	 * 
	 * @param key
	 *            键 不能为null
	 * @param item
	 *            项 不能为null
	 * @return true 存在 false不存在
	 */
	public boolean hHasKey(String key, String item) {
		try {
			return redisTemplate.opsForHash().hasKey(key, item);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * hash递增 如果不存在,就会创建一个 并把新增后的值返回
	 * 
	 * @param key
	 *            键
	 * @param item
	 *            项
	 * @param by
	 *            要增加几(大于0)
	 * @return
	 */
	public double hincr(String key, String item, double by) {
		return redisTemplate.opsForHash().increment(key, item, by);
	}

	/**
	 * hash递减
	 * 
	 * @param key
	 *            键
	 * @param item
	 *            项
	 * @param by
	 *            要减少记(小于0)
	 * @return
	 */
	public double hdecr(String key, String item, double by) {
		try {
			return redisTemplate.opsForHash().increment(key, item, -by);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	// ============================set=============================
	/**
	 * 根据key获取Set中的所有值
	 * 
	 * @param key
	 *            键
	 * @return
	 */
	public Set<Object> sGet(String key) {
		try {
			return redisTemplate.opsForSet().members(key);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 根据value从一个set中查询,是否存在
	 * 
	 * @param key
	 *            键
	 * @param value
	 *            值
	 * @return true 存在 false不存在
	 */
	public boolean sHasKey(String key, Object value) {
		try {
			return redisTemplate.opsForSet().isMember(key, value);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * 将数据放入set缓存
	 * 
	 * @param key
	 *            键
	 * @param values
	 *            值 可以是多个
	 * @return 成功个数
	 */
	public long sSet(String key, Object... values) {
		try {
			return redisTemplate.opsForSet().add(key, values);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	/**
	 * 将set数据放入缓存
	 * 
	 * @param key
	 *            键
	 * @param time
	 *            时间(秒)
	 * @param values
	 *            值 可以是多个
	 * @return 成功个数
	 */
	public long sSetAndTime(String key, long time, Object... values) {
		try {
			Long count = redisTemplate.opsForSet().add(key, values);
			if (time > 0)
				expire(key, time);
			return count;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	/**
	 * 获取set缓存的长度
	 * 
	 * @param key
	 *            键
	 * @return
	 */
	public long sGetSetSize(String key) {
		try {
			return redisTemplate.opsForSet().size(key);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	/**
	 * 移除值为value的
	 * 
	 * @param key
	 *            键
	 * @param values
	 *            值 可以是多个
	 * @return 移除的个数
	 */
	public long setRemove(String key, Object... values) {
		try {
			Long count = redisTemplate.opsForSet().remove(key, values);
			return count;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	// ===============================list=================================
	/**
	 * 获取list缓存的内容
	 * 
	 * @param key
	 *            键
	 * @param start
	 *            开始
	 * @param end
	 *            结束 0 到 -1代表所有值
	 * @return
	 */
	public List<Object> lGet(String key, long start, long end) {
		try {
			return redisTemplate.opsForList().range(key, start, end);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 获取list缓存的长度
	 * 
	 * @param key
	 *            键
	 * @return
	 */
	public long lGetListSize(String key) {
		try {
			return redisTemplate.opsForList().size(key);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	/**
	 * 通过索引 获取list中的值
	 * 
	 * @param key
	 *            键
	 * @param index
	 *            索引 index>=0时， 0 表头，1 第二个元素，依次类推；index<0时，-1，表尾，-2倒数第二个元素，依次类推
	 * @return
	 */
	public Object lGetIndex(String key, long index) {
		try {
			return redisTemplate.opsForList().index(key, index);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 将list放入缓存
	 * 
	 * @param key
	 *            键
	 * @param value
	 *            值
	 * @param time
	 *            时间(秒)
	 * @return
	 */
	public boolean lSet(String key, Object value) {
		try {
			redisTemplate.opsForList().rightPush(key, value);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * 将list放入缓存
	 * 
	 * @param key
	 *            键
	 * @param value
	 *            值
	 * @param time
	 *            时间(秒)
	 * @return
	 */
	public boolean lSet(String key, Object value, long time) {
		try {
			redisTemplate.opsForList().rightPush(key, value);
			if (time > 0)
				expire(key, time);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * 将list放入缓存
	 * 
	 * @param key
	 *            键
	 * @param value
	 *            值
	 * @param time
	 *            时间(秒)
	 * @return
	 */
	public boolean lSet(String key, List<Object> value) {
		try {
			redisTemplate.opsForList().rightPushAll(key, value);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * 将list放入缓存
	 * 
	 * @param key
	 *            键
	 * @param value
	 *            值
	 * @param time
	 *            时间(秒)
	 * @return
	 */
	public boolean lSet(String key, List<Object> value, long time) {
		try {
			redisTemplate.opsForList().rightPushAll(key, value);
			if (time > 0)
				expire(key, time);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * 根据索引修改list中的某条数据
	 * 
	 * @param key
	 *            键
	 * @param index
	 *            索引
	 * @param value
	 *            值
	 * @return
	 */
	public boolean lUpdateIndex(String key, long index, Object value) {
		try {
			redisTemplate.opsForList().set(key, index, value);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * 移除N个值为value
	 * 
	 * @param key
	 *            键
	 * @param count
	 *            移除多少个
	 * @param value
	 *            值
	 * @return 移除的个数
	 */
	public long lRemove(String key, long count, Object value) {
		try {
			Long remove = redisTemplate.opsForList().remove(key, count, value);
			return remove;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
}
