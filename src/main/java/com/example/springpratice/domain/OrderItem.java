package com.example.springpratice.domain;

import com.example.springpratice.domain.item.Item;
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
public class OrderItem {
    @Id
    @GeneratedValue
    @Column(name = "order_item_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    private int orderPrice;//주문가격
    private int count;//주문수량


}
