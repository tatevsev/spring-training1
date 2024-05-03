package com.cydeo.entity;

import com.cydeo.enums.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Table(name = "employees")
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee extends BaseEntity{

    private String firstName;
    private String lastName;
    @Column(columnDefinition = "DATE")
    private LocalDate hireDate ;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private int salary;
}
