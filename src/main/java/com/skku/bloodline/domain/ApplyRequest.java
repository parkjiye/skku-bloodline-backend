package com.skku.bloodline.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class ApplyRequest {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String name;

  @Column(nullable = false)
  String major;

  @Column(nullable = false)
  String studentId;

  @Column(nullable = false)
  String session;

  @Column(nullable = false)
  String phoneNum;

  @Builder
  public ApplyRequest(
      Long id, String name, String major, String studentId, String session, String phoneNum) {
    this.id = id;
    this.name = name;
    this.major = major;
    this.studentId = studentId;
    this.session = session;
    this.phoneNum = phoneNum;
  }
}
