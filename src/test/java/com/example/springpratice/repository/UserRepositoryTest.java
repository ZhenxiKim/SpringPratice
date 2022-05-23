package com.example.springpratice.repository;

import com.example.springpratice.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

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
    //@Transactional
    void crud() {
        /*
        List<User> users = userRepository.findAll(Sort.by(Direction.DESC, "name"));
        users.forEach(System.out::println);
        userRepository.save(new User());

        System.out.println(">>>>" + userRepository.findAll());
        */
        User user = userRepository.getOne(1L);
        System.out.println(user);
    }

    @Test
    void select() {
        System.out.println(userRepository.findByName("martin"));
    }

}