package com.wq.auth.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.wq.auth.user.User;
import com.wq.auth.user.UserDao;

/**
 *author: 		wq
 *datetime: 	2018年8月28日	下午4:47:05
 *E-mail:		1432114216@qq.com
 *blog:			https://blog.csdn.net/weiqiang2
 *Description:	
 *
 */
@Service
public class JwtUserDetailsServiceImpl implements UserDetailsService{
	@Autowired
	private UserDao userDao;

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userDao.findByAccount(username);
		if(user == null){
			throw new UsernameNotFoundException("账户名不存在!");
		}else{
			JwtUserFactory.create(user);
		}
		return null;
	}

}

