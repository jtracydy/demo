package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class ReadingListApplication {

	public static void main(String[] args) {
	    log.info("application start.....");
	    log.error("application error....");
		SpringApplication.run(ReadingListApplication.class, args);
		log.info("application end......");
	}
}
