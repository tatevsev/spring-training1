package com.cydeo.entity;
import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;


@Entity
@Table(name = "merchants")
@NoArgsConstructor
@Data
public class Merchant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String code;
    private BigDecimal transactionFee;
    private BigDecimal commissionRate;
    private Integer payoutDelayCount;

    @OneToMany (mappedBy = "merchant")//in OneToMany relationship, ownership belongs to many side (payment)
    //one merchant - many payments
   private List<Payment> paymentList;


    /*depending on business logic, if we wanna make paymentList accessible from merchant class(bidirectional) then we create relationship in this class ,otherwise(unidirectional)
    only  @ManyToOne
      private Merchant merchant;
    in Payment class

     */

    public Merchant(String name, String code, BigDecimal transactionFee, BigDecimal commissionRate, Integer payoutDelayCount) {
        this.name = name;
        this.code = code;
        this.transactionFee = transactionFee;
        this.commissionRate = commissionRate;
        this.payoutDelayCount = payoutDelayCount;
    }




}


