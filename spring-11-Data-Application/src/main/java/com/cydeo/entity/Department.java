package com.cydeo.entity;

import jakarta.persistence.Access;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor

public class Department extends BaseEntity {
    private String department;
    private String divison;


}
