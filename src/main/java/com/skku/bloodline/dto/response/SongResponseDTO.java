package com.skku.bloodline.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class SongResponseDTO {
  private Long id;
  private String title;
  private String singer;

  private Long team_id;
  private Long concert_id;
  private String videoLink;
  private String image;
  private String description;

  @Builder
  public SongResponseDTO(
      Long id,
      String title,
      String singer,
      Long team_id,
      Long concert_id,
      String videoLink,
      String image,
      String description) {
    this.id = id;
    this.title = title;
    this.singer = singer;
    this.team_id = team_id;
    this.concert_id = concert_id;
    this.videoLink = videoLink;
    this.image = image;
    this.description = description;
  }
}
