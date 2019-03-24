package com.poplar.microservicecloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ApplicationEurekaServer7003 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationEurekaServer7003.class);
    }
}
