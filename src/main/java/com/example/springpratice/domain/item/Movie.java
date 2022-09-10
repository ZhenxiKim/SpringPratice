package com.example.springpratice.domain.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author jhkim
 * @since 2022/09/10
 */
@Entity
@DiscriminatorValue("M")
@Getter
@Setter
public class Movie extends Item{
    private String director;
    private String actor;
}
