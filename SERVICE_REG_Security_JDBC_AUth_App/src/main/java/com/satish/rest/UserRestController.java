package com.satish.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {
	@GetMapping(value="/admin")
	public String admin() {
		return "<h2>Welcome Admin :)<h2>";
	}
	@GetMapping(value="/user")
	public String user() {
		return "<h2>Welcome User :)<h2>";
	}
	@GetMapping(value="/welcome")
	public String welcome() {
		return "<h2>Welcome  :)<h2>";
	}

}
