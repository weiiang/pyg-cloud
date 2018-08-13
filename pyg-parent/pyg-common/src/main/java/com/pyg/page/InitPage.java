package com.pyg.page;
/**
 *	@Create  on 	2018年8月13日		下午8:58:25
 *	@Author: Wq
 *	@E-mail: 1432114216@qq.com
 */

import java.lang.reflect.Field;
import java.util.Map;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

public class InitPage {
	
	/**
	 * 填充分页参数
	 * @param map   请求参数map
	 * @param page  
	 * @return
	 */
	@Deprecated
	public static <T> Page<T> init(Map<String,Object> map,Page<T> page){
		if(map.containsKey("current")) 
			page.setCurrent(Integer.valueOf(map.get("current").toString()));
		if(map.containsKey("size")) 
			page.setSize(Integer.valueOf(map.get("size").toString()));		
		if(map.containsKey("orderByField")) 
			page.setOrderByField(map.get("orderByField").toString());		
		if(map.containsKey("isAsc")) 
			page.setAsc(Boolean.valueOf(map.get("isAsc").toString()));
		return page;
	}
	
	/**
	 * 反射赋值
	 * @param map  数据源
	 * @param page page对象
	 * @return
	 */
	public static <T> Page<T> intanceFromMap(Map<String,Object> map,Page<T> page){
		if(map!=null && page!=null){
			for(Map.Entry<String, Object> mp:map.entrySet()){
				try{
					Field field = Pagination.class.getDeclaredField(mp.getKey());
					if(field!=null){
						String fieldType = field.getGenericType().getTypeName();
						field.setAccessible(true);
						switch(fieldType){
						case "java.lang.String":
							field.set(page, mp.getValue().toString());
							break;
						case "java.lang.Boolean":
						case "boolean":
							Boolean val = false;
							if(mp.getValue().getClass().getTypeName().equals("java.lang.Integer")){
								val = Integer.valueOf(mp.getValue().toString())>0?true:false;
							}else{
								val = Boolean.valueOf(mp.getValue().toString());
							}
							field.set(page,val);
							break;
						case "java.lang.Integer":
						case "int":
							field.set(page, Integer.valueOf(mp.getValue().toString()));
							break;
						}
					}
				}catch(Exception e){}
			}
		}
		return page;
	}
	
}

