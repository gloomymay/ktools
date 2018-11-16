package com.kalvin.ktools;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan
public class KtoolsApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(KtoolsApplication.class, args);
    }

    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(KtoolsApplication.class);
    }
}
