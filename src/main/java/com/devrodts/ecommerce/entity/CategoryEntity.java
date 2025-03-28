package com.devrodts.ecommerce.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class CategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;


    @Column
    private String categoryName;

    @Column
    private String categoryDescription;
}
