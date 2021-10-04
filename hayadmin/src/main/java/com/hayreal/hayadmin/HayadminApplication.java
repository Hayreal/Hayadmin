package com.hayreal.hayadmin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.hayreal.**.dao")
public class HayadminApplication {

    public static void main(String[] args) {
        SpringApplication.run(HayadminApplication.class, args);
    }

}
