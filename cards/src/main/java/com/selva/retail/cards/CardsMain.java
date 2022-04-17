package com.selva.retail.cards;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CardsMain {
    public static void main(String[] args) {
        SpringApplication.run(CardsMain.class,args);
    }
}
