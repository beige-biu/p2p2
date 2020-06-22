package com.wenyu.p2p;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class P2pServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(P2pServiceApplication.class, args);
    }

}
