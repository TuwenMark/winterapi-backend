package com.winter.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Mr.Ye
 */
@SpringBootApplication
@MapperScan("com/winter/api/mapper")
public class WinterApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(WinterApiApplication.class, args);
    }

}
