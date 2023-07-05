package com.example.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private final MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("")
    public String doSometing() {
        return myService.doSomething();
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello from the controller!";
    }

    // Weitere Controller-Methoden hier...
}