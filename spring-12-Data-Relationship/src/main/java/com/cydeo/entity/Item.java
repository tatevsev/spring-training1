package com.cydeo.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String code;

    @ManyToMany(mappedBy = "items")
    private List<Cart> carts;

    public Item(String code, String name) {
        this.code = code;
        this.name = name;
    }
}
