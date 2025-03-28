package com.devrodts.ecommerce.entity;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class OrderEntity {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    public UUID orderId;

    @ManyToOne
    private ProductEntity product;

    @Column
    private List<ProductEntity> products;

    @Column
    private BigDecimal totalValue;

    @Column
    private LocalDateTime updatedAt;

    @Column
    private LocalDateTime createdAt;
}
