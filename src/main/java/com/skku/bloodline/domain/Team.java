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
@Entity(name = "team")
public class Team {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column private String name;
  @Column private String description;
  @Column private String image;
  @Column private Long concert_id;

  @Builder
  public Team(Long id, String name, String description, String image, Long concert_id) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.image = image;
    this.concert_id = concert_id;
  }

  public TeamResponseDTO toEntity() {
    return TeamResponseDTO.builder()
        .id(id)
        .name(name)
        .description(description)
        .image(image)
        .concert_id(concert_id)
        .build();
  }
}
