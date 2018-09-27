package com.wq.auth.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *author: 		wq
 *datetime: 	2018年8月28日	下午3:12:45
 *E-mail:		1432114216@qq.com
 *blog:			https://blog.csdn.net/weiqiang2
 *Description:	
 *
 */
@RestController
public class UserController {

	@Autowired
	private UserDao userDao;
	
	
	@RequestMapping("/user")
	public String get(){
		return userDao.findAll().toString();
	}
}

