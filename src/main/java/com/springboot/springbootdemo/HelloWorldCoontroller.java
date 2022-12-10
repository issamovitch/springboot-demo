package com.springboot.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldCoontroller {

    @GetMapping("/hello-world")
    public String HelloWorld() {
        return "Hello World";
    }
}
