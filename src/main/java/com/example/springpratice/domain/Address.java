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
}
