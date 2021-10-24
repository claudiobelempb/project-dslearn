package com.devsuperior.dslearnbds.modules.task.entities;

import com.devsuperior.dslearnbds.modules.lesson.entities.Lesson;
import com.devsuperior.dslearnbds.modules.section.entities.Section;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name = "tb_task")
public class Task extends Lesson implements Serializable {

  private static final long serialVersionUID = 1L;

  private String description;
  private Integer questionCount;
  private Integer appovalCount;
  private Double weight;
  @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
  private Instant dueDate;

  public Task(){}

  public Task(Long id, String title, Integer position, Section section, String description, Integer questionCount,
              Integer appovalCount, Double weight, Instant dueDate) {
    super(id, title, position, section);
    this.description = description;
    this.questionCount = questionCount;
    this.appovalCount = appovalCount;
    this.weight = weight;
    this.dueDate = dueDate;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Integer getQuestionCount() {
    return questionCount;
  }

  public void setQuestionCount(Integer questionCount) {
    this.questionCount = questionCount;
  }

  public Integer getAppovalCount() {
    return appovalCount;
  }

  public void setAppovalCount(Integer appovalCount) {
    this.appovalCount = appovalCount;
  }

  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }

  public Instant getDueDate() {
    return dueDate;
  }

  public void setDueDate(Instant dueDate) {
    this.dueDate = dueDate;
  }
}
