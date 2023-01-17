package com.skku.bloodline.domain.concerts;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class Concerts {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(length = 500, nullable = false)
  private String title;

  private LocalDateTime date;
  private String place;
  private int stage;

  @Builder
  public Concerts(Long id, String title, LocalDateTime date, String place, int stage) {
    this.id = id;
    this.title = title;
    this.date = date;
    this.place = place;
    this.stage = stage;
  }
}
