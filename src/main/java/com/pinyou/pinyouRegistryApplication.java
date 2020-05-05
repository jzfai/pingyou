package com.pinyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Title: pinyouRegistryApplication
 * @Description:
 * @Auther:jzfai
 * @Version: 1.0
 * @create 2020/3/3 17:31
 */

@SpringBootApplication
@EnableEurekaServer
public class pinyouRegistryApplication {
    public static void main(String[] args) {
        SpringApplication.run(pinyouRegistryApplication.class,args);
    }
}