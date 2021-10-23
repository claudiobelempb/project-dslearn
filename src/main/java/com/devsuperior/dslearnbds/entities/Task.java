package com.devsuperior.dslearnbds.entities;

import java.io.Serializable;
import java.time.Instant;

public class Task implements Serializable {

  private static final long serialVersionUID = 1L;

  private String description;
  private Integer questionCount;
  private Integer appovalCount;
  private Double weight;
  private Instant dueDate;
}
