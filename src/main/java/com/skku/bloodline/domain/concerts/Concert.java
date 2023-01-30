package com.skku.bloodline.domain.concerts;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.sql.Blob;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.type.descriptor.java.BlobJavaType;

@Getter
@NoArgsConstructor
@Entity
public class Concert {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(length = 500, nullable = false)
  private String title;

  @Column private String date;
  @Column private String place;
  @Column private int stage;
  @Column private String image;

  @Builder
  public Concert(Long id, String title, String date, String place, int stage, String image) {
    this.id = id;
    this.title = title;
    this.date = date;
    this.place = place;
    this.stage = stage;
    this.image = image;
  }
}
