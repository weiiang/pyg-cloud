package com.pyg.zuul.filter;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;

//import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

/**
 *author: 		wq
 *datetime: 	2018年9月13日	下午3:15:48
 *E-mail:		1432114216@qq.com
 *blog:			https://blog.csdn.net/weiqiang2
 *Description:	
 *
 */
@Component
public class RequestParamsFilter extends ZuulFilter{
	
	private Logger logger = LoggerFactory.getLogger(RequestParamsFilter.class);
	
	
	

	/**
	 * 过滤器的具体逻辑。在该函数中，我们可以实现自定义的过滤逻辑，来确定是否要拦截当前的请求，
	 * 不对其进行后续的路由，或是在请求路由返回结果之后，对处理结果做一些加工等。
	 */
	@Override
	public Object run() {
		RequestContext currentContext = RequestContext.getCurrentContext();
		HttpServletRequest request = currentContext.getRequest();
		logger.info("REQUEST:::"+request.getScheme()+"    IP:"+request.getRemoteAddr()+"    port:"+request.getRemotePort());
		
		 StringBuilder params = new StringBuilder("?");
	        Enumeration<String> names = request.getParameterNames();
	        if( request.getMethod().equals("GET") ) {
	    	   while (names.hasMoreElements()) {
		   		  String name = (String) names.nextElement();
		   		  params.append(name);
		   		  params.append("=");
		   		  params.append(request.getParameter(name));
		   		  params.append("&");
	   		   }
	        }
	        
	        if (params.length() > 0) {
	        	params.delete(params.length()-1, params.length());
	        }
	        logger.info("REQUEST::: > " + request.getMethod() + " " + request.getRequestURI() + params + " " + request.getProtocol());

	        Enumeration<String> headers = request.getHeaderNames();

	        while (headers.hasMoreElements()) {
	            String name = (String) headers.nextElement();
	            String value = request.getHeader(name);
	            logger.info("REQUEST::: > " + name + ":" + value);
	        }

	        final RequestContext ctx = RequestContext.getCurrentContext();
	        if (!ctx.isChunkedRequestBody()) {
	            ServletInputStream inp = null;
	            try {
	                inp = ctx.getRequest().getInputStream();
	                String body = null;
	                if (inp != null) {
//	                	body = IOUtils.toString(inp);
//	                	logger.info("REQUEST::: > " + body);

	                }
	            } catch (IOException e) {
	                e.printStackTrace();
	            }

	        }
	        String token = request.getParameter("token");

	
	        if (token == "" || token == null){
	            logger.warn("::: need token, but your token is null rr you don't have token");
	            //过滤请求,什么都不返回
//	            currentContext.setSendZuulResponse(false);
//	            currentContext.setResponseStatusCode(400);
//	            throw new RuntimeException("token is null");
	        }
	        logger.info("::: token ={}",token) ;

	

		return null;
	}

	/**
	 * 返回一个boolean类型来判断该过滤器是否要执行。我们可以通过此方法来指定过滤器的有效范围。
	 */
	@Override
	public boolean shouldFilter() {
		return true;
	}

	/**
	 * 通过int值来定义过滤器的执行顺序，数值越小优先级越高。
	 */
	@Override
	public int filterOrder() {
		return 0;
	}

	/**
	 * pre：可以在请求被路由之前调用。
	 * routing：在路由请求时候被调用。
	 * post：在routing和error过滤器之后被调用。
	 * error：处理请求时发生错误时被调用。
	 */
	@Override
	public String filterType() {
		return "pre";
	}

}

