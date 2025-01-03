package com.satish.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class MyRestController {
	@GetMapping("/single")
	public Mono<String> SingleResponse(){
		return Mono.just("Return single response");
	}
	@GetMapping("/multiple")
	public Flux<Integer> multipleResponses(){
		return Flux.range(1, 10);
	}

}
