package com.example.zhangzhic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import tk.mybatis.spring.annotation.MapperScan;

@EnableScheduling
@SpringBootApplication
@MapperScan(basePackages = "com.example.zhangzhic.zzc.mapper")
public class ZhangzhicApplication{

    public static void main(String[] args) {
        SpringApplication.run(ZhangzhicApplication.class, args);
    }

}
