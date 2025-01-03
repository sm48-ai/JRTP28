package com.satish.feign;

import org.springframework.stereotype.Component;

@Component
public class GreetFeignClientFallback implements GreetFeignClient {

    @Override
    public String invokeGreetApi() {
        // Return a fallback message when the service is unavailable
        return "GREET-API is unavailable at the moment, please try again later.";
    }
}
