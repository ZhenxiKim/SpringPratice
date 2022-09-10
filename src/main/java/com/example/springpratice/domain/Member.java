package com.example.springpratice.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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
    @Column(name = "member_id")
    private Long id;

    private String name;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "member")//order 객체의 member필드에 의해 연관성을 맺음
    private List<Order> orders = new ArrayList<>();//양방향 참조 발생

}
