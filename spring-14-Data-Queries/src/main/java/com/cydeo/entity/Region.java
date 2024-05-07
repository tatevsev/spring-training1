package com.cydeo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "regions")
public class Region extends BaseEntity{
    private String region;
    private String country;

}
