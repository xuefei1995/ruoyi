package com.xuefei;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xuefei.dao")
public class OaProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OaProviderApplication.class, args);
    }

}
