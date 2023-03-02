package com.skku.bloodline.dto.request;

import com.skku.bloodline.domain.Team;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CreateTeamDTO {
  public String name;
  public String description;
  public String image;
  public Long concert_id;

  public CreateTeamDTO(String name, String description, String image, Long concert_id) {
    this.name = name;
    this.description = description;
    this.image = image;
    this.concert_id = concert_id;
  }

  @Builder
  public Team toEntity() {
    return Team.builder()
        .name(name)
        .description(description)
        .image(image)
        .concert_id(concert_id)
        .build();
  }
}
