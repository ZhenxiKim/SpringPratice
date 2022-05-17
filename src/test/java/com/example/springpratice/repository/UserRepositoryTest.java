package com.example.springpratice.repository;

import com.example.springpratice.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author jhkim
 * @since 2022/05/17
 */
@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    void crud() {
        userRepository.save(new User());

        System.out.println(">>>>" + userRepository.findAll());
    }
}