package com.ecommerce.store.data.model;

import javax.persistence.Id;

public class Feedback {
    @Id
    private Long id;
    private String comment;
    private String rating;
}
