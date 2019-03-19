package com.mrz.springboot.elasticsearch.config.client;

/**
 * Created by maruizhong on 2019/3/11.
 */
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@EnableEurekaClient
@RestController
public class ConfigClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class,args);
    }
    @Value("${server.port}")
    String sayhi;
    @RequestMapping(value = "/sayhi")
    public String sayhi(){
        return sayhi;
    }

}
