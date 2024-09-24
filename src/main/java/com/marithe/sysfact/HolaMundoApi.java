package com.marithe.sysfact;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoApi {

    @GetMapping("/hola")
    public String hello() {
        return "Hola Mundo API test - Spring Boot";
    }
}
