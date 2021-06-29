package com.deliciasazucena.breakfast.infrastructure.exceptions;

public class RequiredInfoException extends RuntimeException{
  public RequiredInfoException(String message) {
    super(message);
  }
}
