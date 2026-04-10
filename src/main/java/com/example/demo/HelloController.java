package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Rahul D R";
    }

    @GetMapping("/hello_rahul")
    public String call_Rahul() {
        return "Hello CI/CD Works!";
    }
}