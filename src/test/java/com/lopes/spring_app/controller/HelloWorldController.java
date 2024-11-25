package com.lopes.spring_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")

public class HelloWorldController {

    private HelloWorldService helloWorldService;


    public HelloWorldController(helloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;

}

    @GetMapping
    public String helloWorld() {
        return "Hello World!";
    }
}
