package com.wq.auth.security;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.wq.auth.user.User;

/**
 *author: 		wq
 *datetime: 	2018年8月28日	下午4:53:40
 *E-mail:		1432114216@qq.com
 *blog:			https://blog.csdn.net/weiqiang2
 *Description:	
 *	创建JwtUser的工厂类
 */
public final class JwtUserFactory {
	
	private JwtUserFactory(){}
	
	public static JwtUser create(User user){
		return new JwtUser(
				user.getId(), 
				user.getAccount(), 
				user.getPassword(), 
				user.getEmail(), 
				mapToGrantedAuthorities(user.getRoles()), 
				user.getLastPasswordResetDate());
	}
	private static List<GrantedAuthority> mapToGrantedAuthorities(List<String> authorities) {

		return authorities.stream()
				.map(SimpleGrantedAuthority::new)
				.collect(Collectors.toList());
    }

}

