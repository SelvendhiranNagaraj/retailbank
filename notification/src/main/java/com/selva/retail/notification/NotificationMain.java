package com.selva.retail.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class NotificationMain {
    public static void main(String[] args) {
        SpringApplication.run(NotificationMain.class,args);
    }
}
