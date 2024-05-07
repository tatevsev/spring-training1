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
    private Status paymentStatus;

   //@OneToOne(cascade = CascadeType.ALL) //CascadeType.ALL same is happening in parent-child classes

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}) //parent gets modified, child stays the same
    //one payment can have 1 payment detail
   // @JoinColumn(name = "payment_detail_id") //to change foreign column name on the table
    private PaymentDetail paymentDetail;
    //we don't add paymentDetail to constructor because that info needs to come from joints table, we don't provide that info by ourselves

    @ManyToOne //many payments one merchant
    private Merchant merchant;

    @ManyToOne
    private Customer customer;



    public Payment(Status paymentStatus, LocalDate createdDte, BigDecimal amount) {
        this.paymentStatus = paymentStatus;
        this.createdDte = createdDte;
        this.amount = amount;
    }
}


