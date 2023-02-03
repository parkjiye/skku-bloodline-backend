package com.skku.bloodline.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class SongResponseDTO {

  private String title;
  private String singer;

  private String team;
  private String concert;
  private String videoLink;
  private String image;
  private String description;

  @Builder
  public SongResponseDTO(
      String title,
      String singer,
      String team,
      String concert,
      String videoLink,
      String image,
      String description) {
    this.title = title;
    this.singer = singer;
    this.team = team;
    this.concert = concert;
    this.videoLink = videoLink;
    this.image = image;
    this.description = description;
  }
}
