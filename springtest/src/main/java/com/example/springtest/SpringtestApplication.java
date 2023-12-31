package com.example.springtest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringtestApplication {
	private static final Logger log = LoggerFactory.getLogger(SpringtestApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringtestApplication.class, args);
	}
	
}


	