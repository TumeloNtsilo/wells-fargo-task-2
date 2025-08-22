package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Customer {

    @Id
    @GeneratedValue()
    private long customerId;

    @ManyToOne
    @JoinColumn(name = "advisor_Id", nullable = false)
    private Advisor advisorId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;

    public Customer(){

    }
    public Customer(String firstName,Advisor advisorId, String lastName, String address, String phone, String email){
        this.firstName = firstName;
        this.advisorId = advisorId;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public Advisor getAdvisorId() {
        return advisorId;
    }

    public void setAdvisorId(Advisor advisorId) {
        this.advisorId = advisorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
