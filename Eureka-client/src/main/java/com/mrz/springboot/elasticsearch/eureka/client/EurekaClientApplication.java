package com.mrz.springboot.elasticsearch.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
/**
 * Created by maruizhong on 2019/3/11.
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class,args);
    }
    @Value("${spring.application.name}")
    String name;
    @RequestMapping("/")
    public String home() {
        return "request from applicationName " + name;
    }
}
