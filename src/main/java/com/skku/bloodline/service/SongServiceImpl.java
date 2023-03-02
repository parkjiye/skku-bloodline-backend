package com.skku.bloodline.service;

import com.skku.bloodline.domain.Song;
import com.skku.bloodline.dto.request.CreateSongDTO;
import com.skku.bloodline.dto.response.SongResponseDTO;
import com.skku.bloodline.repository.SongRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class SongServiceImpl implements SongService {
  private final SongRepository songRepository;

  public SongServiceImpl(SongRepository songRepository) {
    this.songRepository = songRepository;
  }

  @Transactional
  public Long saveSong(CreateSongDTO createSongDTO) {
    return songRepository.save(createSongDTO.toEntity()).getId();
  }

  @Override
  public List<SongResponseDTO> findByTeam(Long team_id) {
    return songRepository.findByTeam(team_id).stream()
        .map(Song::toEntity)
        .collect(Collectors.toList());
  }

  @Override
  public List<SongResponseDTO> findByConcert(Long concert_id) {
    return songRepository.findByConcert(concert_id).stream()
        .map(Song::toEntity)
        .collect(Collectors.toList());
  }
}
