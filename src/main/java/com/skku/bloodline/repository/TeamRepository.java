package com.skku.bloodline.repository;

import com.skku.bloodline.domain.Team;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TeamRepository extends JpaRepository<Team, Long> {
  @Query("SELECT a FROM team a " + "WHERE a.concert_id = :concert_id")
  List<Team> findByConcert(@Param("concert_id") Long concert_id);
}
