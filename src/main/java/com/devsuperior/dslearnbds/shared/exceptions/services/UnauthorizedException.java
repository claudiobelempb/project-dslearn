package com.devsuperior.dslearnbds.shared.exceptions.services;

import java.io.Serializable;

public class UnauthorizedException extends RuntimeException implements Serializable {

  private static final long serialVersionUID = 1L;

  public UnauthorizedException(String msg) {
    super(msg);
  }
}
