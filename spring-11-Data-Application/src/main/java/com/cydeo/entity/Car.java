package com.cydeo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
//we don't provide AllArgConstructor because we want postgres to create ID on its on
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String make;
    private String model;

    public Car(String make, String model) { //we don't include Id so postgres creates it for us
        this.make = make;
        this.model = model;
    }
}
