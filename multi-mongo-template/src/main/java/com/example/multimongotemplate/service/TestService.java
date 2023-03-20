package com.example.multimongotemplate.service;

import com.example.multimongotemplate.dao.TestDao;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class TestService {
    private final TestDao testDao;
    public void getData() {
        testDao.findAll();
    }
}
