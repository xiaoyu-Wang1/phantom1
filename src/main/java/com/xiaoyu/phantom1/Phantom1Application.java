package com.xiaoyu.phantom1;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xiaoyu.phantom1.dao")
public class Phantom1Application {
	private final static Logger logger = LoggerFactory.getLogger(Phantom1Application.class);
	public static void main(String[] args) {
		SpringApplication.run(Phantom1Application.class, args);
		logger.info("日志輸出測試");

	}
}
