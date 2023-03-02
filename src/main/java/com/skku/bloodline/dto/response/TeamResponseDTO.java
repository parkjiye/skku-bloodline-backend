package com.skku.bloodline.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
public class TeamResponseDTO {
  private Long id;
  private String name;
  private String description;
  private String image;
  private Long concert_id;

  @Builder
  public TeamResponseDTO(Long id, String name, String description, String image, Long concert_id) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.image = image;
    this.concert_id = concert_id;
  }
}
