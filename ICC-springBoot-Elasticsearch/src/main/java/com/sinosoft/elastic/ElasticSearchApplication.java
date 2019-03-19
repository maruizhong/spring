package com.sinosoft.elastic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by maruizhong on 2019/3/14.
 */
@SpringBootApplication
public class ElasticSearchApplication {
    public static void main( String[] args )
    {
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        SpringApplication.run(ElasticSearchApplication.class, args);
    }
}
