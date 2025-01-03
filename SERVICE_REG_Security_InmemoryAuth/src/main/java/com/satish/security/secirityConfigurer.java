package com.satish.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.satish.service.MyUserDetailsService;

@Configuration
@EnableWebSecurity
public class secirityConfigurer  {
	@Autowired
	private MyUserDetailsService userDetailServ;
	
	@Autowired
	public void configureUsers(AuthenticationManagerBuilder auth) throws Exception{
		auth.userDetailsService(userDetailServ)
		.passwordEncoder(NoOpPasswordEncoder.getInstance());
	}
	
	@Bean
	public SecurityFilterChain securityConfig(HttpSecurity http) throws Exception {
	    http
	        .authorizeHttpRequests(auth -> auth
	            .requestMatchers("/contact").permitAll()  // Correct usage with requestMatchers()
	            .anyRequest().authenticated()  // For all other requests, authentication is required
	        )
	        .formLogin();  // Null is replaced with withDefaults() for default login configuration
	    

	    return http.build();
	}

}
