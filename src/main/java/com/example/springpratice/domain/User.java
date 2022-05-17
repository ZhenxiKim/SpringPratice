package com.example.springpratice.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author jhkim
 * @since 2022/05/17
 */

@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Data
@Entity
public class User {
    @NonNull
    private String name;

    @NonNull
    private String email;

    @Id
    @GeneratedValue
    private Long id;


}
