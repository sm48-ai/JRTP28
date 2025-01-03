package com.satish;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class ServiceRegAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegAdminServerApplication.class, args);
	}

}
