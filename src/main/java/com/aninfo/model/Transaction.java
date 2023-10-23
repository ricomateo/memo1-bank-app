package com.aninfo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long cbu;
    private TransactionType type;
    private Double sum;

    public Transaction(){
    }
    public Transaction(Long cbu, TransactionType type, Double sum) {
        this.cbu = cbu;
        this.type = type;
        this.sum = sum;
    }

    public Double getSum() {
        return this.sum;
    }

    public Long getId() {
        return this.id;
    }

    public Long getCbu() {
        return this.cbu;
    }

    public TransactionType getType() {
        return this.type;
    }

}
