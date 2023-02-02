package com.skku.bloodline.repository;

import com.skku.bloodline.domain.Concert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConcertRepository extends JpaRepository<Concert, Long> {}
