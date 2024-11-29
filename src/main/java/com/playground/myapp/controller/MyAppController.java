package com.playground.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyAppController {

    @GetMapping("/test")
    public String testResponse() {
        return "Hello World";
    }

}
