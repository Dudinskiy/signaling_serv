package com.example.signaling_serv.service;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class GreetingService {

    public Mono<String> getGreeting(String name) {
        return Mono.just("Hello, " + name);
    }
}
