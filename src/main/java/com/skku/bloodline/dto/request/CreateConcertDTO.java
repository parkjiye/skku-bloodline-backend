package com.skku.bloodline.dto.request;

import com.skku.bloodline.domain.concerts.Concert;
import lombok.Builder;
import lombok.Getter;
import org.hibernate.type.descriptor.java.BlobJavaType;

@Getter
public class CreateConcertDTO {

  private String title;
  private String date;
  private String place;
  private int stage;
  private String image;

  @Builder
  public CreateConcertDTO(String title, String date, String place, int stage, String image) {
    this.title = title;
    this.date = date;
    this.place = place;
    this.stage = stage;
    this.image = image;
  }

  public Concert toEntity() {
    return Concert.builder().title(title).date(date).place(place).stage(stage).image(image).build();
  }
}
