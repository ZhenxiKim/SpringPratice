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
@DiscriminatorValue("B")
@Getter
@Setter
public class Book extends Item{
    private String author;
    private String isbn;
}
