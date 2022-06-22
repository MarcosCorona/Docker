package com.example.BP1.persona.exception;

import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@RestControllerAdvice
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

  @ExceptionHandler(NotFoundException404.class)
  public final ResponseEntity<ExceptionResponse> handlerNotFoundException(NotFoundException404 notFoundException404, WebRequest request){
    ExceptionResponse customError = new ExceptionResponse(new Date(), notFoundException404.getMessage(),
            request.getDescription(false), HttpStatus.NOT_FOUND.getReasonPhrase());
    return new ResponseEntity<ExceptionResponse>(customError, HttpStatus.NOT_FOUND);
  }

  @ExceptionHandler(UnprocesableException422.class)
  public final ResponseEntity<ExceptionResponse> handlerUnprocesableException(UnprocesableException422 unprocesableException422, WebRequest request){
    ExceptionResponse customError = new ExceptionResponse(new Date(), unprocesableException422.getMessage(),
            request.getDescription(false), HttpStatus.UNPROCESSABLE_ENTITY.getReasonPhrase());
    return new ResponseEntity<ExceptionResponse>(customError, HttpStatus.UNPROCESSABLE_ENTITY);
  }
}