package com.example.springpratice.domain.item;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

/**
 * @author jhkim
 * @since 2022/09/10
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "dtype")
@Getter
@Setter
public abstract class Item {
    @Id
    @GeneratedValue
    @Column(name = "item_id")
    private Long id;

    private String name;

    private int price;

    private int stockQuantity;
}
