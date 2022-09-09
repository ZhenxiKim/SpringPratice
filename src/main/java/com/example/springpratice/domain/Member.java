package com.example.springpratice.domain;

import lombok.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author jhkim
 * @since 2022/05/17
 */

@Getter
@Setter
@Entity
public class Member {
    @Id
    @GeneratedValue
    private Long id;

    private String userName;

}
