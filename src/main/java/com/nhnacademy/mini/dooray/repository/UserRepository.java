package com.nhnacademy.mini.dooray.repository;

import com.nhnacademy.mini.dooray.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
