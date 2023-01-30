package com.skku.bloodline.service;

import com.skku.bloodline.domain.concerts.Concert;
import com.skku.bloodline.dto.request.CreateConcertDTO;
import java.util.List;

public interface ConcertService {
  Long saveConcert(CreateConcertDTO createConcertDTO);

}
