package com.satish.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.satish.feign.GreetFeignClient;

@RestController
public class WelcomeRestController {
	@Autowired
	private GreetFeignClient feignClient;
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		
		String greetResp=feignClient.invokeGreetApi();
		
		//RestTemplate rt=new RestTemplate();
		//ResponseEntity<String> entity= rt.getForEntity("http://localhost:8081/greet", String.class);
		//String greetResp=entity.getBody();
		return greetResp+",  Welcome to the world of satish";
		
	}

}
