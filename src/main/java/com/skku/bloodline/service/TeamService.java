package com.skku.bloodline.service;

import com.skku.bloodline.dto.request.CreateTeamDTO;
import com.skku.bloodline.dto.response.TeamResponseDTO;
import java.util.List;

public interface TeamService {
  Long saveTeam(CreateTeamDTO createTeamDTO);

  List<TeamResponseDTO> findAllTeams();

  TeamResponseDTO findById(Long teamUUID);
}
