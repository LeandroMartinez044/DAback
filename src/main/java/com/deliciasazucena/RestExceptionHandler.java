package com.deliciasazucena;

import com.deliciasazucena.breakfast.infrastructure.exceptions.BreakfastNameAlreadyExistsException;
import com.deliciasazucena.breakfast.infrastructure.exceptions.RequiredInfoException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {


  @ResponseStatus(HttpStatus.NOT_FOUND)
  //@ExceptionHandler({Exception.class})
  @ResponseBody
  public ErrorMessage notFoundRequest(Exception e){
    return new ErrorMessage(HttpStatus.NOT_FOUND.value(), e.getMessage());
  }


  @ResponseStatus(HttpStatus.BAD_REQUEST)
  @ExceptionHandler({
      BreakfastNameAlreadyExistsException.class,
      RequiredInfoException.class})
  @ResponseBody
  public ErrorMessage badRequest(Exception exception){
    return new ErrorMessage(HttpStatus.BAD_REQUEST.value(), exception.getMessage());
  }


  @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
  @ExceptionHandler({Exception.class})
  @ResponseBody
  public ErrorMessage fatalErrorUnexpectedException(){
    return new ErrorMessage(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Internal Server Error");
  }

}
