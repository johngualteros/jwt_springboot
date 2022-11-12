package com.john.jwt_springboot.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("contacts")
@AllArgsConstructor
public class Contact {

    private final com.john.jwt_springboot.repository.Contact contactRepository;

    @GetMapping
    public List<com.john.jwt_springboot.model.Contact> getAllContacts(){
        return contactRepository.findAll();
    }
}
