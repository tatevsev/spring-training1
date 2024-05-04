package com.cydeo.entity;
import com.cydeo.enums.Status;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;


@Data
@NoArgsConstructor
@Entity
@Table(name = "payments")

public class Payment {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition ="DATE")
    private LocalDate createdDte;

    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    private Status status;

    public Payment(Status status, LocalDate createdDte, BigDecimal amount) {
        this.status = status;
        this.createdDte = createdDte;
        this.amount = amount;
    }
}


