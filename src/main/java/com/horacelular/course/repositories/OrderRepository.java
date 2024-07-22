package com.horacelular.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.horacelular.course.entities.Order;

/**
 * UserRepository
 */
public interface OrderRepository extends JpaRepository<Order, Long> {

}
