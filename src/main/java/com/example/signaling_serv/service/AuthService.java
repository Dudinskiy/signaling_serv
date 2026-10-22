package com.example.signaling_serv.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class AuthService {


    public Mono<String> registerNewUser() {
        return null;
    }


    public Mono<String> login() {
        return null;
    }


    public Mono<String> logout() {
        return null;
    }
}
