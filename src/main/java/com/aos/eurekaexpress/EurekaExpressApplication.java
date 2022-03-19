package com.aos.eurekaexpress;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaExpressApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaExpressApplication.class,args);

    }
}
