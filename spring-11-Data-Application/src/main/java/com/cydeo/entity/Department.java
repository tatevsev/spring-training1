package com.cydeo.entity;

import jakarta.persistence.Access;
import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor

public class Department extends BaseEntity {
    private String department;
    private String divison;


}
