package com.niit.vhr1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.niit.vhr1.mapper")
public class Vhr1Application {

    public static void main(String[] args) {
        SpringApplication.run(Vhr1Application.class, args);
    }

}
