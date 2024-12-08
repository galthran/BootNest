package com.jarosinski.bootnest.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("hello")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/welcome")
    public String sayWelcome() {
        return "Welcome all";
    }
}
