package com.hero;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//@EnableTransactionManagement
@MapperScan(basePackages = "com.hero.dao")
@SpringBootApplication
public class HeroshoppingApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeroshoppingApplication.class, args);
	}

}
