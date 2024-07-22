package com.horacelular.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.horacelular.course.entities.Category;

/**
 * CategoryRepository
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
