package com.cydeo.entity;

import com.cydeo.enums.Gender;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Data
@Table(name = "employees")
public class Employee extends BaseEntity{
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate hireDate;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private Integer salary;
    @ManyToOne
    @JoinColumn(name = "department")//spring will create department_id by default but hence in our sql table its named "department"
    private Department department;

    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region region;
}
