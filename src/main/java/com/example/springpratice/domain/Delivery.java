package com.example.springpratice.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author jhkim
 * @since 2022/09/10
 */
@Entity
@Getter
@Setter
public class Delivery {
    @Id
    @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;

    @OneToOne(mappedBy = "delivery", fetch = FetchType.LAZY)
    private Order order;

    @Embedded
    private Address address;

    @Enumerated(EnumType.STRING)
    private DeliveryStatus status;
}
