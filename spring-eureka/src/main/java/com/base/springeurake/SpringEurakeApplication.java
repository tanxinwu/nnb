package com.base.springeurake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringEurakeApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringEurakeApplication.class, args);
    }

}
