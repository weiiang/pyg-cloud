package com.wq.auth.security;

import java.util.Collection;
import java.util.Date;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 *author: 		wq
 *datetime: 	2018年8月28日	下午4:20:42
 *E-mail:		1432114216@qq.com
 *blog:			https://blog.csdn.net/weiqiang2
 *Description:	
 *
 */
public class JwtUser implements UserDetails{
	
	private static final long serialVersionUID = 1L;
	private final Long id;
	private final String username;
	private final String password;
	private final String email;
	private final Collection<? extends GrantedAuthority> authorities;
    private final Date lastPasswordResetDate;
    public JwtUser(
            Long long1,
            String username,
            String password,
            String email,
            Collection<? extends GrantedAuthority> authorities,
            Date lastPasswordResetDate) {
        this.id = long1;
        this.username = username;
        this.password = password;
        this.email = email;
        this.authorities = authorities;
        this.lastPasswordResetDate = lastPasswordResetDate;
    }
	
    @JsonIgnore//JSON序列化和反序列化的时候都忽略该字段
	public Long getId() {
		return id;
	}
	public String getUsername() {
		return username;
	}
    @JsonIgnore
	public String getPassword() {
		return password;
	}
    @JsonIgnore
	public String getEmail() {
		return email;
	}
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}
    @JsonIgnore
	public Date getLastPasswordResetDate() {
		return lastPasswordResetDate;
	}
    @JsonIgnore
	public boolean isAccountNonExpired() {
		return true;
	}
    @JsonIgnore
	public boolean isAccountNonLocked() {
		return true;
	}
    @JsonIgnore
	public boolean isCredentialsNonExpired() {
		return true;
	}
    @JsonIgnore
	public boolean isEnabled() {
		return true;
	}
	

	
	
}

