package com.example.backend.controller;

import com.example.backend.model.HelloMessage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    HelloMessage hello() {
        return HelloMessage.builder().massage1("hello").massage2("world").build();
    }
}
