package com.wenyu.p2p;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class P2pApplication {

    public static void main(String[] args) {
        SpringApplication.run(P2pApplication.class, args);
    }

}
