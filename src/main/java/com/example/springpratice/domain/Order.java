package com.example.springpratice.domain;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author jhkim
 * @since 2022/09/10
 */
@Entity
@Getter
@Setter
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue
    @Column(name = "order_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id")//fk, 양방향관계에서 주인
    private Member member;

    @OneToMany(mappedBy = "order")//이 필드에 의해 매핑
    private List<OrderItem> orderitems = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "delivery_id")
    private Delivery delivery;

    private LocalDateTime orderDate;//주문시간

    @Enumerated(EnumType.ORDINAL)
    private OrderStatus status;
}
