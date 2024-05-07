package com.cydeo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String address;
    private String email;
    private String name;

    private String sur_name;
    private String user_name;

    public Customer(String address, String email, String name, String sur_name, String user_name) {
        this.address = address;
        this.email = email;
        this.name = name;
        this.sur_name = sur_name;
        this.user_name = user_name;
    }

    @OneToMany(mappedBy = "customer") //one customer many payments
    private List<Payment> paymentList;

}
