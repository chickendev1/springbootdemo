package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api")
public interface DemoApi {
    @RequestMapping("/hello")
    public String getHelloWorld();
}
