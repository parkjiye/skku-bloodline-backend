package com.skku.bloodline.controller;

import com.skku.bloodline.dto.base.BaseResponse;
import com.skku.bloodline.dto.base.ResponseMessage;
import com.skku.bloodline.dto.request.CreateSongDTO;
import com.skku.bloodline.service.SongService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SongController {
  private final SongService songService;

  public SongController(SongService songService) {
    this.songService = songService;
  }

  @PostMapping("/api/songs")
  public ResponseEntity<?> saveSongs(@RequestBody CreateSongDTO createSongDTO) {
    return new ResponseEntity<>(
        BaseResponse.response(
            HttpStatus.OK, ResponseMessage.POST_SONG, songService.saveSong(createSongDTO)),
        HttpStatus.OK);
  }

