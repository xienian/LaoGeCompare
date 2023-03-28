package com.example.laogecompare;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.laogecompare.mapper")
public class LaoGeCompareApplication {

    public static void main(String[] args) {
        SpringApplication.run(LaoGeCompareApplication.class, args);
    }

}
