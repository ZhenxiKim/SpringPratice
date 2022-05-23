package com.example.springpratice.repository;

import com.example.springpratice.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author jhkim
 * @since 2022/05/17
 */
public interface UserRepository extends JpaRepository<User,Long> {
    User findByName(String name);
}
