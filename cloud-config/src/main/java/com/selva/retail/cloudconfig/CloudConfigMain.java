package com.selva.retail.cloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudConfigMain {
    public static void main(String[] args) {
        SpringApplication.run(CloudConfigMain.class,args);
    }
}
