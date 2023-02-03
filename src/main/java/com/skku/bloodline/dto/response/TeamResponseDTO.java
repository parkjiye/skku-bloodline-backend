package com.skku.bloodline.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
public class TeamResponseDTO {
  private Long id;
  private String teamName;
  private String description;
  private String image;

  @Builder
  public TeamResponseDTO(Long id, String teamName, String description, String image) {
    this.id = id;
    this.teamName = teamName;
    this.description = description;
    this.image = image;
  }
}
