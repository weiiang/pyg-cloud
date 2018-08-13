package com.pyg.base.controller;
/**
 *	create on 	2018年8月9日		下午8:59:26
 *	@Author: Wq
 *	E-mail:  1432114216@qq.com
 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.alibaba.fastjson.JSONObject;

public abstract class BaseController {
	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	/**
	 * 异常处理
	 * @param request
	 * @param e
	 * @return
	 */
	@ExceptionHandler
    public ResponseEntity<String> exception(HttpServletRequest request, Exception e) {  
		//添加自己的异常处理逻辑，如日志记录　
        //request.setAttribute("exceptionMessage", e.getMessage()); 
		logger.error(e.getMessage(),e);
        return this.Resp417(e.getMessage());
	}
		
	/**得到request对象
	 * @return HttpServletRequest
	 */
	protected HttpServletRequest getRequest() {
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		return request;
	}
	/**
	 * 获取缓存的key
	 * @return 
	 * @throws Exception
	 */
	protected String getToken() throws Exception{
		String token = getRequest().getHeader("x-token");
		if(StringUtils.isNotBlank(token)){
			return token;
		}
		throw new Exception("无当前登录用户信息");
	}
	/**
	 * 请求参数map
	 * @return 参数map
	 */
	protected Map<String,Object> getParams(){
		Map<String, Object> paramMap = new HashMap<String, Object>();
		Map<String,String[]> it = getRequest().getParameterMap();
		for(Entry<String,String[]> entry:it.entrySet()){
			if(entry.getValue().length==1){
				paramMap.put(entry.getKey(), entry.getValue()[0]);
			}else{
				paramMap.put(entry.getKey(), entry.getValue());
			}
		}
	    return paramMap;
	}
	
	/***********************************返回值统一封装begin************************************/
	// 常用：200 , 400,  417,  415
	
	/**
	 * 操作成功
	 * @param desc 描述/数据
	 * @return
	 */
	protected <T> ResponseEntity<T> Resp200(T desc){
		return ResponseEntity.ok(desc);
	}
	
	/**
	 * 请求参数错误导致操作失败，状态码：400
	 * @param desc 错误描述
	 * @return
	 */
	protected <T> ResponseEntity<T> Resp400(T desc){
		return ResponseEntity.badRequest().body(desc);
	}
	
	/**
	 * 无权限导致操作失败，状态码：401
	 * @param desc 错误描述
	 * @return
	 */
	protected <T> ResponseEntity<T> Resp401(T desc){
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(desc);
	}
	
	/**
	 * 超时导致操作失败，状态码：408
	 * @param desc 错误描述
	 * @return
	 */
	protected <T> ResponseEntity<T> Resp408(T desc){
		return ResponseEntity.status(HttpStatus.REQUEST_TIMEOUT).body(desc);
	}
	
	/**
	 * 不支持类型导致操作失败，状态码：415
	 * @param desc 错误描述
	 * @return
	 */
	protected <T> ResponseEntity<T> Resp415(T desc){
		return ResponseEntity.status(HttpStatus.UNSUPPORTED_MEDIA_TYPE).body(desc);
	}
	
	/**
	 * 服务器异常导致操作失败，状态码：417
	 * @param desc 错误描述
	 * @return
	 */
	protected <T> ResponseEntity<T> Resp417(T desc){
		return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(desc);
	}
	
	/**
	 * 资源被锁定导致操作失败，状态码：423
	 * @param desc 错误描述
	 * @return
	 */
	protected <T> ResponseEntity<T> Resp423(T desc){
		return ResponseEntity.status(HttpStatus.LOCKED).body(desc);
	}
	
	/***********************************返回值统一封装end************************************/
	
}

