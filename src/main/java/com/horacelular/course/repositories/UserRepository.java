package com.horacelular.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.horacelular.course.entities.User;

/**
 * UserRepository
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
