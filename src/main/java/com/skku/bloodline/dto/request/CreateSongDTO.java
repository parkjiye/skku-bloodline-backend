package com.skku.bloodline.dto.request;

import com.skku.bloodline.domain.Song;
import lombok.Builder;
import lombok.Getter;

@Getter
public class CreateSongDTO {
  private String title;
  private String singer;

  private Long team_id;
  private Long concert_id;
  private String videoLink;
  private String image;
  private String description;

  @Builder
  public CreateSongDTO(
      String title,
      String singer,
      Long team_id,
      Long concert_id,
      String videoLink,
      String image,
      String description) {
    this.title = title;
    this.singer = singer;
    this.team_id = team_id;
    this.concert_id = concert_id;
    this.videoLink = videoLink;
    this.image = image;
    this.description = description;
  }

  public Song toEntity() {
    return Song.builder()
        .title(title)
        .singer(singer)
        .team_id(team_id)
        .concert_id(concert_id)
        .videoLink(videoLink)
        .image(image)
        .description(description)
        .build();
  }
}
