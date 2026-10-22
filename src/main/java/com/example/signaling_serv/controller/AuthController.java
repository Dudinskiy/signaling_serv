package com.example.signaling_serv.controller;

import com.example.signaling_serv.service.AuthService;
import com.example.signaling_serv.service.GreetingService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/signaling_serv/api/v1/auth/")
@AllArgsConstructor
public class AuthController {

    private final GreetingService greetingService;
    private final AuthService authService;


    @GetMapping("/greeting/{name}")
    public Mono<String> getGreeting(@PathVariable String name) {
        return greetingService.getGreeting(name);
    }

    @PostMapping("registration")
    public Mono<String> registerNewUser() {
        return authService.registerNewUser();
    }

    @PostMapping("login")
    public Mono<String> login() {
        return authService.login();
    }

    @PostMapping("logout")
    public Mono<String> logout() {
        return authService.logout();
    }

}


