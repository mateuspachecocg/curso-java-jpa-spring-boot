package com.horacelular.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.horacelular.course.entities.User;

/**
 * UserResource
 */
@RestController
@RequestMapping(value = "/users")
public class UserResource {

  @GetMapping
  public ResponseEntity<User> findAll() {
    User u = new User(1L, "Mateus", "mateus@gmail.com", "88981371512", "13245");
    return ResponseEntity.ok().body(u);
  }
}
