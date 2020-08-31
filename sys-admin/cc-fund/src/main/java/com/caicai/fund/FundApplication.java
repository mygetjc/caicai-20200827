package com.caicai.fund;

import com.alicp.jetcache.anno.config.EnableCreateCacheAnnotation;
import com.alicp.jetcache.anno.config.EnableMethodCache;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 江成
 * @version 1.0.0
 * @date 2020/8/27 16:54
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
@EnableMethodCache(basePackages = "com.cc")
@EnableCreateCacheAnnotation
public class FundApplication {

    public static void main(String[] args) {
        SpringApplication.run(FundApplication.class, args);
    }
}
