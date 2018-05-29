package com.example.demo.controller.impl;

import com.example.demo.controller.DemoApi;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController implements DemoApi {
    @Override
    public String getHelloWorld() {
        return "Hello world";
    }
}
