package com.skku.bloodline.dto.request;

import com.skku.bloodline.domain.Song;
import lombok.Builder;
import lombok.Getter;

@Getter
public class CreateSongDTO {
  private String title;
  private String singer;

  private String team;
  private String concert;
  private String videoLink;

  private String image;
  private String description;

  @Builder
  public CreateSongDTO(
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

  public Song toEntity() {
    return Song.builder()
        .title(title)
        .singer(singer)
        .team(team)
        .concert(concert)
        .videoLink(videoLink)
        .image(image)
        .description(description)
        .build();
  }
}
