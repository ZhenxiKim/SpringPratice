package com.example.springpratice.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

/**
 * @author jhkim
 * @since 2022/09/10
 */
@Embeddable
@Getter
public class Address {
    private String city;
    private String street;
    private String zipcode;

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }

    protected Address() {
        //jpa 스펙 특성상 기본 생성자를 public OR protected로 생성해야함
    }
}
