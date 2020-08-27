package com.caicai.fund;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 江成
 * @version 1.0.0
 * @date 2020/8/27 16:54
 */
@SpringBootApplication
@EnableDiscoveryClient
public class FundApplication {

    public static void main(String[] args) {
        SpringApplication.run(FundApplication.class, args);
    }
}
