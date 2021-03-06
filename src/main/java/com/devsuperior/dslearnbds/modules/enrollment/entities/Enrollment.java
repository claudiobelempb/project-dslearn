package com.devsuperior.dslearnbds.modules.enrollment.entities;

import com.devsuperior.dslearnbds.modules.deliver.entities.Deliver;
import com.devsuperior.dslearnbds.modules.enrollment.entities.pk.EnrollmentPK;
import com.devsuperior.dslearnbds.modules.lesson.entities.Lesson;
import com.devsuperior.dslearnbds.modules.offer.entities.Offer;
import com.devsuperior.dslearnbds.modules.user.entities.User;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tb_enrollment")
public class Enrollment implements Serializable {

  private static final long serialVersionUID = 1L;

  @EmbeddedId
  private final EnrollmentPK id = new EnrollmentPK();

  @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
  private Instant enrollMoment;

  @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
  private Instant refundMoment;
  private boolean available;
  private boolean onlyUpdate;

  @ManyToMany(mappedBy = "enrollmentsDone")
  private Set<Lesson> lessonsDone = new HashSet<>();

  @OneToMany(mappedBy = "enrollment")
  private final List<Deliver> deliveries = new ArrayList<>();

  public Enrollment(){}

  public Enrollment(User user, Offer offer, Instant enrollMoment, Instant refundMoment, boolean available,
                    boolean onlyUpdate) {
    id.setUser(user);
    id.setOffer(offer);
    this.enrollMoment = enrollMoment;
    this.refundMoment = refundMoment;
    this.available = available;
    this.onlyUpdate = onlyUpdate;
  }

  public User getUser(){
    return id.getUser();
  }

  public void setUser(User user) {
    id.setUser(user);
  }

  public Offer getOffer(){
    return id.getOffer();
  }

  public void setOffer(Offer offer) {
    id.setOffer(offer);
  }

  public Instant getEnrollMoment() {
    return enrollMoment;
  }

  public void setEnrollMoment(Instant enrollMoment) {
    this.enrollMoment = enrollMoment;
  }

  public Instant getRefundMoment() {
    return refundMoment;
  }

  public void setRefundMoment(Instant refundMoment) {
    this.refundMoment = refundMoment;
  }

  public boolean isAvailable() {
    return available;
  }

  public void setAvailable(boolean available) {
    this.available = available;
  }

  public boolean isOnlyUpdate() {
    return onlyUpdate;
  }

  public void setOnlyUpdate(boolean onlyUpdate) {
    this.onlyUpdate = onlyUpdate;
  }

  public List<Deliver> getDeliveries() {
    return deliveries;
  }
}
