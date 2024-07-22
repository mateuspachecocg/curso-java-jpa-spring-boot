package com.horacelular.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.horacelular.course.entities.Product;

/**
 * ProductRepository
 */
public interface ProductRepository extends JpaRepository<Product, Long> {

}
