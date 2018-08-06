package com.pyg.configuration;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.plugins.PerformanceInterceptor;

@Configuration
@MapperScan("com.pyg.mapper*")
public class MybatisPlusConfigration {

	private Logger logger = org.slf4j.LoggerFactory.getLogger(MybatisPlusConfigration.class);
	
    @Bean
    public PerformanceInterceptor performanceInterceptor() {
    	logger.info("配置mybatisplugin");
        return new PerformanceInterceptor();
    }

    
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        paginationInterceptor.setLocalPage(true);// 开启 PageHelper 的支持
        logger.info("开启pageHelper支持");
        return paginationInterceptor;
    }
}