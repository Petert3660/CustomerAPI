package com.ptconsultancy.entities;

import com.ptconsultancy.domain.datamodels.Address;
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
    private Address primaryAddress;

    public Customer() {
        super();
    }

    public Customer(Long custId, String forename, String surname, Address primaryAddress) {
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

    public Address getPrimaryAddress() {
        return primaryAddress;
    }

    public void setPrimaryAddress(Address primaryAddress) {
        this.primaryAddress = primaryAddress;
    }
}
