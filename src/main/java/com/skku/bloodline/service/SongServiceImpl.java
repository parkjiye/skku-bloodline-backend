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
  public List<SongResponseDTO> findAllSongs() {
    return songRepository.findAll().stream().map(Song::toEntity).collect(Collectors.toList());
  }

  @Override
  public List<SongResponseDTO> findByConcert(String concert) {
    return songRepository.findByConcert(concert).stream()
        .map(Song::toEntity)
        .collect(Collectors.toList());
  }
}
