package com.devrodts.ecommerce.entity;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.UUID;

public class ProductEntity {

    private UUID productID;
    private String  productName;
    private String productDescription;
    private String imageUrl;


    @ManyToOne
    @JoinColumn(name = "categoryId")
    private CategoryEntity category;
}
