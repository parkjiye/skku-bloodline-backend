package com.skku.bloodline.dto.base;

import lombok.Builder;
import org.springframework.http.HttpStatus;

public class BaseResponse<T> {
  private HttpStatus statusCode;
  private String message;
  private T data;

  @Builder
  public BaseResponse(HttpStatus statusCode, String message, T data) {
    this.statusCode = statusCode;
    this.message = message;
    this.data = data;
  }

  public static <T> BaseResponse<T> response(
      final HttpStatus statusCode, final String message, final T data) {
    return BaseResponse.<T>builder().data(data).statusCode(statusCode).message(message).build();
  }
}
