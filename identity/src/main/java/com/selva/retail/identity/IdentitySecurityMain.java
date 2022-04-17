package com.selva.retail.identity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class IdentitySecurityMain {

    public static void main(String[] args) {
        SpringApplication.run(IdentitySecurityMain.class,args);
    }
}
