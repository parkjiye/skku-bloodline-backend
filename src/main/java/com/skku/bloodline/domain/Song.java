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
@Entity
public class Song {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String title;

  @Column private String singer;
  @Column private String team;
  @Column private String concert;
  @Column private String videoLink;
  @Column private String image;

  @Column(length = 500)
  private String description;

  @Builder
  public Song(
      Long id,
      String title,
      String singer,
      String team,
      String concert,
      String videoLink,
      String image,
      String description) {
    this.id = id;
    this.title = title;
    this.singer = singer;
    this.team = team;
    this.concert = concert;
    this.videoLink = videoLink;
    this.image = image;
    this.description = description;
  }

  public SongResponseDTO toEntity() {
    return SongResponseDTO.builder()
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
