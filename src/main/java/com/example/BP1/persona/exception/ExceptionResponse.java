package com.example.BP1.persona.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class ExceptionResponse {
  private Date timestamp;
  private String mensaje;
  private String detalles;
  private String httpCodeMessage;

}