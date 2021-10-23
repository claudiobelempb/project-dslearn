package com.devsuperior.dslearnbds.entities;

import java.io.Serializable;
import java.util.Objects;

public class Section implements Serializable {

  private static final long serialVersionUID = 1L;

  private Long id;
  private String title;
  private String description;
  private Integer position;
  private String imgUri;

  public Section(){}

  public Section(Long id, String title, String description, Integer position, String imgUri) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.position = position;
    this.imgUri = imgUri;
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

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  public String getImgUri() {
    return imgUri;
  }

  public void setImgUri(String imgUri) {
    this.imgUri = imgUri;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Section section = (Section) o;
    return id.equals(section.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
