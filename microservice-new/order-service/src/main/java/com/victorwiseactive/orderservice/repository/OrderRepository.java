package com.victorwiseactive.orderservice.repository;

import com.victorwiseactive.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
