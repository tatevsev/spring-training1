package com.cydeo.entity;

import com.cydeo.enums.Gender;
import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name="students")
public class Student {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY) //postgres will generate ID for each student
    private Long id;

    @Column(name = "studentFirstName")
    private String firstName;

    @Column(name = "studentLastName")
    private String lastName;
    private String email;

    @Column(columnDefinition = "DATE")
    private LocalDate birthDate;

    @Column(columnDefinition = "TIME")
    private LocalDate birthTime;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime birthDatetime;

    @Enumerated(EnumType.STRING)
   // @Enumerated(EnumType.ORDINAL) will have numeric value for gender 0 or 1
    private Gender gender;

    @Transient //if you dont wanna show this in the table
    private String city;





}
