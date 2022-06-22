package com.example.cache.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.interceptor.CacheErrorHandler;
import org.springframework.context.annotation.Bean;

public class CustomCacheManager extends CachingConfigurerSupport {

    @Bean
    @Override
    public CacheManager cacheManager(){
        return null;
    }

    @Override
    public CacheErrorHandler errorHandler(){
        return null;
    }

}

