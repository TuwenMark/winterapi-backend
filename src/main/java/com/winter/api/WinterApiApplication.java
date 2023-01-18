package com.winter.api;

import com.winter.api.provider.EmbeddedZooKeeper;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Mr.Ye
 */
@SpringBootApplication
@MapperScan("com/winter/api/mapper")
//@EnableDubbo()
public class WinterApiApplication {

    public static void main(String[] args) {
        new EmbeddedZooKeeper(2181, false).start();
        SpringApplication.run(WinterApiApplication.class, args);
        System.out.println("dubbo service started");
    }

}
