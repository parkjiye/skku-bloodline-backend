package com.skku.bloodline.repository;

import com.skku.bloodline.domain.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {}
