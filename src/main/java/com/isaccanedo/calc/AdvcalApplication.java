package com.isaccanedo.calc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.isaccanedo.calc")
public class calcApplication {

	public static void main(String[] args) {
		SpringApplication.run(calcApplication.class, args);
	}
}
