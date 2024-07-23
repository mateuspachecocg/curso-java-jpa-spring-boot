package com.horacelular.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.horacelular.course.entities.OrderItem;

/**
 * UserRepository
 */
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
