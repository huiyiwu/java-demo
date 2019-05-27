package com.huchx.shm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.huchx.shm.mapper")
public class ShmApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShmApplication.class, args);
    }

}
