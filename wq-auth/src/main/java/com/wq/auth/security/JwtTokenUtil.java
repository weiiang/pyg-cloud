package com.wq.auth.security;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

/**
 *author: 		wq
 *datetime: 	2018年8月28日	下午5:04:07
 *E-mail:		1432114216@qq.com
 *blog:			https://blog.csdn.net/weiqiang2
 *Description:	
 *	JwtToken工具类
 */
@Component
public class JwtTokenUtil {
	
	private static final String CLAIM_KEY_USERNAME = "sub";
	private static final String CLAIM_KEY_CREATED = "created";
	
	

	/**
	 * 加密的密钥
	 */
    @Value("${jwt.secret}")
    private String secret;
    
    /**
     * 过期时间
     */
    @Value("${jwt.expiration}")
    private Long expiration;
    
    /**
     * 根据token拿到Claims
     * Claims:存放信息的地方
     * @param token
     * @return
     */
    private Claims getClaimsFromToken(String token){
    	Claims claims ;
    	try{
    		claims = Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
    	}catch(Exception e){
    		return null;
    	}
    	return claims;
    }
    
    /**
     * 根据token拿到用户名
     * @param token
     * @return
     */
    public String getUserNameFromToken(String token){
    	String username;
    	try{
    		final Claims claim = getClaimsFromToken(token);
        	username = claim.getSubject();
    	}catch(Exception e){
    		return null;
    	}
    	return username;
    }
    
    /**
     * 根据token获取token颁发的时间
     * @param token
     * @return
     */
    public Date getCreateDateFromToken(String token){
    	Date date;
    	try{
    		final Claims claims = getClaimsFromToken(token);
    		date = new Date((Long) claims.get(CLAIM_KEY_CREATED));
    		return date;
    	}catch(Exception e){
    		return null;
    	}
    }
    /**
     * 根据token获取过期时间
     * @param token
     * @return
     */
    public Date getExpirationFromToken(String token){
    	Date date;
    	try{
    		final Claims claims = getClaimsFromToken(token);
    		date = claims.getExpiration();
    		return date;
    	}catch(Exception e){
    		return null;
    	}
    }
    /**
     * 给当前时间加上过期时间
     * @return
     */
    private Date generateExpirationDate(){
    	return new Date(System.currentTimeMillis() + expiration *1000);
    }
    
    /**
     * 根据token判断是否过期
     * @param token
     * @return
     */
    private boolean isTokenExpirated(String token){
    	final Date date = getExpirationFromToken(token);
    	return date.before(new Date());
    }
    /**
     * 判断token的颁发时间是否早于密码修改的时间
     * @param created
     * @param lastModifyPwd
     * @return
     */
    public boolean isCreateBeforeLastModifyPassword(Date created, Date lastModifyPwd){
    	return (lastModifyPwd != null && created.before(lastModifyPwd));
    }
    /**
     * 根据claims生成token
     * @param claims
     * @return
     */
    private String generateToken(Map<String, Object> claims){
    	return Jwts.builder()
    			.setClaims(claims)
    			.setExpiration(generateExpirationDate())
    			.signWith(SignatureAlgorithm.HS256, secret)
    			.compact();
    }
    /**
      * 自定义生成token的Map参数
     * @param userDetails
     * @return
     */
    public String generateToken(UserDetails userDetails){
    	Map<String, Object> claims = new HashMap<String, Object>();
    	claims.put(CLAIM_KEY_USERNAME, userDetails.getUsername());
    	claims.put(CLAIM_KEY_CREATED, new Date());
    	return generateToken(claims);
    }
    /**
     * 刷新token	就是重新设置过期时间
     * @param token
     * @return
     */
    public String refreshToken(String token){
    	String refreshToken;
    	try{
    		final Claims claims = getClaimsFromToken(token);
    		claims.put(CLAIM_KEY_CREATED, new Date());
    		refreshToken = generateToken(claims);
    		return refreshToken;
    	}catch(Exception e){
    		e.printStackTrace();
    		return null;
    	}
    }
    
    /**
     * 校验token是否有效
     * @param token
     * @param details
     * @return
     */
    public boolean validateToken(String token, UserDetails details){
    	JwtUser jwtUser = (JwtUser) details;
    	final String username = getUserNameFromToken(token);
    	final Date created = getCreateDateFromToken(token);
    	return username.equals(jwtUser.getUsername())//用户名相同
    			&& isTokenExpirated(token)//是否过期
    			&& !isCreateBeforeLastModifyPassword(created, jwtUser.getLastPasswordResetDate());//密码修改时间是否在token办法之前
    }
    
    public Boolean canTokenBeRefreshed(String token, Date lastPasswordReset) {
        final Date created = getCreateDateFromToken(token);
        return !isCreateBeforeLastModifyPassword(created, lastPasswordReset)
                && !isTokenExpirated(token);
    }
}

