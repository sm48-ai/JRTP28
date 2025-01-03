package com.satish.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

public class WelcomeRestController {
	@Value("${msg}")
	private String msg;
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		return msg;
	}

}