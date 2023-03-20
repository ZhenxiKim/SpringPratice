package com.example.multimongotemplate.controller;

import com.example.multimongotemplate.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class TestController {
    private final TestService testService;
    public void getData() {
        testService.getData();
    }
}
