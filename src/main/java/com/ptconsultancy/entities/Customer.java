package com.ptconsultancy.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long custId;
    private String forename;
    private String surname;
    @OneToOne
    private AddressEntity primaryAddress;

    public Customer() {
        super();
    }

    public Customer(Long custId, String forename, String surname, AddressEntity primaryAddress) {
        this.custId = custId;
        this.forename = forename;
        this.surname = surname;
        this.primaryAddress = primaryAddress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public AddressEntity getPrimaryAddress() {
        return primaryAddress;
    }

    public void setPrimaryAddress(AddressEntity primaryAddress) {
        this.primaryAddress = primaryAddress;
    }
}
