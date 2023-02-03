package com.skku.bloodline.domain;

import com.skku.bloodline.dto.response.TeamResponseDTO;
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
public class Team {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String teamName;

  @Column(length = 1000)
  private String description;

  @Column private String image;

  @Builder
  public Team(Long id, String teamName, String description, String image) {
    this.id = id;
    this.teamName = teamName;
    this.description = description;
    this.image = image;
  }

  public TeamResponseDTO toEntity() {
    return TeamResponseDTO.builder()
        .id(id)
        .teamName(teamName)
        .description(description)
        .image(image)
        .build();
  }
}
