package com.taipham.test_jenkins.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HomeController {
    
    @GetMapping()
    public String getMethodName() {
        return "<h1>Hello, World</h1>";
    }
    
}
