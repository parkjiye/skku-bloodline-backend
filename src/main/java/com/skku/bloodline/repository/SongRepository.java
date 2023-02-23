package com.skku.bloodline.repository;

import com.skku.bloodline.domain.Song;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface SongRepository extends JpaRepository<Song, Long> {

  @Query("SELECT a FROM song a " + "WHERE a.concert = :concert")
  List<Song> findByConcert(@Param("concert") String concert);
}
