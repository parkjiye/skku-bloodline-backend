package com.skku.bloodline.service;

import com.skku.bloodline.dto.request.CreateSongDTO;
import com.skku.bloodline.dto.response.SongResponseDTO;
import java.util.List;

public interface SongService {
  Long saveSong(CreateSongDTO createSongDTO);

  List<SongResponseDTO> findByTeam(Long team_id);

  List<SongResponseDTO> findByConcert(String concert);
}
