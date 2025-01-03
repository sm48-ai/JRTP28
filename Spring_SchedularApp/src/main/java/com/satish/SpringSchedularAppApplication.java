package com.satish;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringSchedularAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSchedularAppApplication.class, args);
	}

}
