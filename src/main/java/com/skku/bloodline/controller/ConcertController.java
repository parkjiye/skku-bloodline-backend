package com.skku.bloodline.controller;

import com.skku.bloodline.dto.base.BaseResponse;
import com.skku.bloodline.dto.base.ResponseMessage;
import com.skku.bloodline.dto.request.CreateConcertDTO;
import com.skku.bloodline.service.ConcertService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// 컨트롤러를 JSON을 반환하는 컨트롤러로 만들어준다.
@RestController
public class ConcertController {

  private final ConcertService concertService;

  public ConcertController(ConcertService concertService) {
    this.concertService = concertService;
  }

  @PostMapping(value = "/api/concerts")
  public ResponseEntity<?> saveConcerts(@RequestBody CreateConcertDTO createConcertDTO) {
    return new ResponseEntity<>(
        BaseResponse.response(
            HttpStatus.OK,
            ResponseMessage.POST_CONCERT,
            concertService.saveConcert(createConcertDTO)),
        HttpStatus.OK);
  }

}
