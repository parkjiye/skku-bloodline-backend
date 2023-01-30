package com.skku.bloodline.service;

import com.skku.bloodline.domain.concerts.Concert;
import com.skku.bloodline.dto.request.CreateConcertDTO;
import com.skku.bloodline.repository.ConcertRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ConcertServiceImpl implements ConcertService {
  private final ConcertRepository concertRepository;

  public ConcertServiceImpl(ConcertRepository concertRepository) {
    this.concertRepository = concertRepository;
  }

  @Transactional
  public Long saveConcert(CreateConcertDTO createConcertDTO) {
    return concertRepository.save(createConcertDTO.toEntity()).getId();
  }

}
