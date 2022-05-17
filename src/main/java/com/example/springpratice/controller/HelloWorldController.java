package com.example.springpratice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jhkim
 * @since 2022/05/07
 */
@RestController
public class HelloWorldController {
    @GetMapping("/helloworld")
    public String helloController() {
        return "hello world!";
    }
}
