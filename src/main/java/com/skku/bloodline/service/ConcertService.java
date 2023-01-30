package com.skku.bloodline.service;

import com.skku.bloodline.dto.request.CreateConcertDTO;
import com.skku.bloodline.dto.response.ConcertResponseDTO;
import java.util.List;

public interface ConcertService {
  Long saveConcert(CreateConcertDTO createConcertDTO);

  List<ConcertResponseDTO> findAllConcerts();
}
