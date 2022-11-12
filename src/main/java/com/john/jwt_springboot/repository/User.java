package com.john.jwt_springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface User extends JpaRepository<com.john.jwt_springboot.model.User, Long> {

    Optional<com.john.jwt_springboot.model.User> findOneByEmail(String email);
}
