package com.cydeo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@Table(name = "COURSES")
public class Course extends BaseEntity {

        @Column(name = "NAME")
        private String name;
        @Column(name = "CATEGORY")
        private String category;
        @Column(name = "RATING")
        private int rating;
        @Column(name = "DESCRIPTION")
        private String description;


}
