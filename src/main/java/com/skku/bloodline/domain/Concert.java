package com.skku.bloodline.domain;

import com.skku.bloodline.dto.response.ConcertResponseDTO;
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
public class Concert {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(length = 500, nullable = false)
  private String title;

  @Column private String date;
  @Column private String place;
  @Column private int stage;
  @Column private String image;

  @Builder
  public Concert(Long id, String title, String date, String place, int stage, String image) {
    this.id = id;
    this.title = title;
    this.date = date;
    this.place = place;
    this.stage = stage;
    this.image = image;
  }

  public ConcertResponseDTO toEntity() {
    return ConcertResponseDTO.builder()
        .title(title)
        .date(date)
        .place(place)
        .stage(stage)
        .image(image)
        .build();
  }
}
