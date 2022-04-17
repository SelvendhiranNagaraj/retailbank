package com.selva.retail.insurance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class InsuranceMain {
    public static void main(String[] args) {
        SpringApplication.run(InsuranceMain.class,args);
    }
}
