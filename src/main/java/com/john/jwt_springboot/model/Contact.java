package com.john.jwt_springboot.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.LocalDate;

@Entity
@Data
public class Contact {

    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idcontact")
    private Long id;

    private String name;

    private LocalDate birthdate;

    private String phone;

    private String email;
}
