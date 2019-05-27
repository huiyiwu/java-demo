package com.huchx.shj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.huchx.shj.dao") // JPA扫描该包路径下的Repositorie
@EntityScan("com.huchx.shj.entity") // 扫描Entity实体类
public class ShjApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShjApplication.class, args);
    }

}
