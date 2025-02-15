package com.horacelular.course.services.exceptions;

/**
 * ResourceNotFoundException
 */
public class ResourceNotFoundException extends RuntimeException {

  public ResourceNotFoundException(Object id) {
    super("Resource not found. Id " + id);
  }
}
