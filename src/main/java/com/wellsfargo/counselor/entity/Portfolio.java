package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @OneToOne
    @JoinColumn(name = "customer_Id", nullable = false)
    private Customer customer;

    @Column
    private LocalDate date;


    public Portfolio(){

    }

    public Portfolio(Customer customer, LocalDate date){
        this.customer = customer;
        this.date = date;

    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(long portfolioId) {
        this.portfolioId = portfolioId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
