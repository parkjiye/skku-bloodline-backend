package com.skku.bloodline.repository;

import com.skku.bloodline.domain.concerts.Concert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConcertRepository extends JpaRepository<Concert, Long> {}
