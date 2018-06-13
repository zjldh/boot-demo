package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/{message}")
    public String sayMessage(@PathVariable("message") String message) {
        System.out.println(message);
        return "say hello! msg:" + message;
    }

    @GetMapping("/say")
    public String say() {
        return "say hello!";
    }
}
