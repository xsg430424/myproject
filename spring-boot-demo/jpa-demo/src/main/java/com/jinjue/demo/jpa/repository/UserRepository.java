package com.jinjue.demo.jpa.repository;


import com.jinjue.demo.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findUsersByUserNameIsLike(String username);
    User findUserByUserName(String username);
}
