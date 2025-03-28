package com.devrodts.ecommerce.service;

import com.devrodts.ecommerce.repository.CategoryRepository;
import com.devrodts.ecommerce.repository.OrderRepository;
import com.devrodts.ecommerce.repository.ProductRepository;
import com.devrodts.ecommerce.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class OrderService {

    private final OrderRepository orderReposity;
    private final UserRepository userRepository;
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;
    private final OrderMapper ordermapper;


    public OrderService(
            OrderRepository orderRepository,
            UserRepository userRepository,
            ProductRepository productRepository,
            CategoryRepository categoryRepository,
            OrderMapper orderMapper,
            OrderRepository orderReposity,
            UserRepository userRepository,
            ProductRepository productRepository,
            CategoryRepository categoryRepository
    ){
        this.categoryRepository = categoryRepository;

    }
}
