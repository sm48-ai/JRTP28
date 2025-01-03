package com.satish.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MsgRestController {
	
	@GetMapping("/loginc")
	public String Login() {
		return "Login page is Loading................";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "Hi this is my contact no :+91 89 48 887 079";
	}
	@GetMapping("/hi")
	public String sayHi() {
		return "Hi , How are You  ??????";
	}
	
	@GetMapping("/heloo")
	public String sayHeloo() {
		return "Heloo , How are You  ??????";
	}

}
