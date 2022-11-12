package com.john.jwt_springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Contact extends JpaRepository<com.john.jwt_springboot.model.Contact, Long> {
}
