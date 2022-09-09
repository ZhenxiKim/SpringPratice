package com.example.springpratice.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jhkim
 * @since 2022/05/07
 */
@RestController
public class HelloController {
    @GetMapping("hello")
    public String helloController(Model model) {
        model.addAttribute("data", "hello");
        return "hello world!";
    }
}
