package com.skku.bloodline.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ConcertResponseDTO {
  private Long id;
  private String title;
  private String date;
  private String place;
  private int stage;
  private String image;

  @Builder
  public ConcertResponseDTO(
      Long id, String title, String date, String place, int stage, String image) {
    this.id = id;
    this.title = title;
    this.date = date;
    this.place = place;
    this.stage = stage;
    this.image = image;
  }
}
