package com.wq.auth.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *author: 		wq
 *datetime: 	2018年8月28日	下午3:11:32
 *E-mail:		1432114216@qq.com
 *blog:			https://blog.csdn.net/weiqiang2
 *Description:	
 *
 */
@Repository
public interface UserDao extends CrudRepository<User, Long>{

	User findByAccount(String account);

}

