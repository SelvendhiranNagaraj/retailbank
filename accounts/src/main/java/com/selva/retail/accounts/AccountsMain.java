package com.selva.retail.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AccountsMain {
    public static void main(String[] args) {
        SpringApplication.run(AccountsMain.class,args);
    }
}
