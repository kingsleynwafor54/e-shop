package com.ecommerce.store.data.model;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column
    private Double price;
    @Column
    @Enumerated(EnumType.STRING)
    private Currency currency;
    @Column(length = 500)
    private String details;
    @ElementCollection
    private List<String> imageUrl;
    @OneToMany
    private List<Feedback>feedbacks;
}
