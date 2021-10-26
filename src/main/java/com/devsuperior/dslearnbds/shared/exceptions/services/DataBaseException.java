package com.devsuperior.dslearnbds.shared.exceptions.services;

public class DataBaseException extends RuntimeException {
  private static final long serialVersionUID = 1L;

  public DataBaseException(String message) {
    super(message);
  }
}
