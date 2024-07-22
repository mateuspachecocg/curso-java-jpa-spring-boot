package com.horacelular.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.horacelular.course.entities.Category;
import com.horacelular.course.repositories.CategoryRepository;

/**
 * CategoryService
 */
@Service
public class CategoryService {

  @Autowired
  private CategoryRepository repository;

  public List<Category> findAll() {
    return repository.findAll();
  }

  public Category findByid(Long id) {
    Optional<Category> obj = repository.findById(id);
    return obj.get();
  }
}
