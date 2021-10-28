package com.devsuperior.dslearnbds.shared.exceptions.services;

import java.io.Serializable;

public class ForbiddenException extends RuntimeException implements Serializable {

  private static final long serialVersionUID = 1L;

  public ForbiddenException(String msg){
    super(msg);
  }
}
