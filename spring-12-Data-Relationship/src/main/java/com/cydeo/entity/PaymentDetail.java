package com.cydeo.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "paymentDetails")
@NoArgsConstructor
@Data


public class PaymentDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal merchantPayoutAmount;

    private BigDecimal commissionAmount;

    @Column(columnDefinition = "DATE")
    private LocalDate paymentDate;

    @OneToOne(mappedBy = "paymentDetail") //will drop payment_id in paymentDetail, don't create foreign key  payment_id inside paymentDetail,payment table will have ownership over this relationships
    private Payment payment;

    public PaymentDetail(BigDecimal merchantPayoutAmount, BigDecimal commissionAmount, LocalDate paymentDate) {
        this.merchantPayoutAmount = merchantPayoutAmount;
        this.commissionAmount = commissionAmount;
        this.paymentDate = paymentDate;
    }
}
