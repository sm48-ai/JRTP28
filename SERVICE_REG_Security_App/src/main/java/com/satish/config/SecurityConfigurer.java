package com.satish.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfigurer {

	@Bean
	public SecurityFilterChain securityFilter(HttpSecurity http) throws Exception {
		System.out.println("Security Filter Called......");

		http.authorizeHttpRequests((req) -> 
	    req.requestMatchers("/contact", "/loginc","/swagger-ui.html")
	    .permitAll()
	    .anyRequest()
	    .authenticated()
	).formLogin(); // Configure form-based login


		return http.build();
	}

}
