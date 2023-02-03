package com.skku.bloodline.dto.request;

import com.skku.bloodline.domain.Team;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CreateTeamDTO {
  public String teamName;
  public String description;
  public String image;

  @Builder
  public CreateTeamDTO(String teamName, String description, String image) {
    this.teamName = teamName;
    this.description = description;
    this.image = image;
  }

  public Team toEntity() {
    return Team.builder().teamName(teamName).description(description).image(image).build();
  }
}
