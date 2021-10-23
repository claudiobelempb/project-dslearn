package com.devsuperior.dslearnbds.entities;

import java.io.Serializable;
import java.util.Objects;

public class Lesson implements Serializable {

  private static final long serialVersionUID = 1L;

  private Long id;
  private String title;
  private Integer position;

  public Lesson(){}

  public Lesson(Long id, String title, Integer position) {
    this.id = id;
    this.title = title;
    this.position = position;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Lesson lesson = (Lesson) o;
    return id.equals(lesson.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
