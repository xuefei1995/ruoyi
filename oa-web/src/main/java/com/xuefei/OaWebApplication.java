package com.xuefei;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@EnableSwagger2Doc
@ServletComponentScan(basePackages = "com.xuefei.filter")
public class OaWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(OaWebApplication.class, args);
    }
}
