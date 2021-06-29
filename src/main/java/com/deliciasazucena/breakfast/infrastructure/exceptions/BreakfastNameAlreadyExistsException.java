package com.deliciasazucena.breakfast.infrastructure.exceptions;

public class BreakfastNameAlreadyExistsException extends RuntimeException {
  public BreakfastNameAlreadyExistsException(String message) {
    super(message);
  }
}
