package com.satish.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.satish.feign.GreetFeignClient;

@RestController
public class WelcomeRestController1 {
	@Autowired
	private GreetFeignClient greetClient;
	
	@GetMapping("/welcome")
	public String getWelcomeMsg1() {
		String greetResp=greetClient.invokeGreetApi();
		
		return greetResp + ", Welcome to SatishWorld";
	}

}
