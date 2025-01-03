package com.satish;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient

public class ServiceRegApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegApiGatewayApplication.class, args);
	}

}
