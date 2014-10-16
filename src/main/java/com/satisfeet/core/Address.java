package com.satisfeet.core;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "code")
    private Integer code;

    @Column(name = "street")
    private String street;

    @OneToOne
    @JoinColumn(name = "city_id")
    private City city;

    public Integer getCode() {
        return this.code;
    }

    public String getCity() {
        return this.city.getName();
    }

    public String getStreet() {
        return this.street;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setCity(String city) {
        this.city.setName(city);
    }

    public void setStreet(String street) {
        this.street = street;
    }

}
