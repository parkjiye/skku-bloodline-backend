package com.skku.bloodline.domain;

import com.skku.bloodline.dto.response.SongResponseDTO;
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
@Entity(name = "song")
public class Song {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column private String title;
  @Column private String singer;
  @Column private Long team_id;
  @Column private Long concert_id;
  @Column private String videoLink;
  @Column private String image;
  @Column private String description;

  @Builder
  public Song(
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

  public SongResponseDTO toEntity() {
    return SongResponseDTO.builder()
        .id(id)
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
