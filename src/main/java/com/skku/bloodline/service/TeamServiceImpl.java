package com.skku.bloodline.service;

import com.skku.bloodline.domain.Team;
import com.skku.bloodline.dto.request.CreateTeamDTO;
import com.skku.bloodline.dto.response.TeamResponseDTO;
import com.skku.bloodline.repository.TeamRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class TeamServiceImpl implements TeamService {
  private final TeamRepository teamRepository;

  public TeamServiceImpl(TeamRepository teamRepository) {
    this.teamRepository = teamRepository;
  }

  @Transactional
  public Long saveTeam(CreateTeamDTO createTeamDTO) {
    return teamRepository.save(createTeamDTO.toEntity()).getId();
  }

  @Override
  public List<TeamResponseDTO> findAllTeams() {
    return teamRepository.findAll().stream().map(Team::toEntity).collect(Collectors.toList());
  }

  @Override
  public TeamResponseDTO findById(Long teamUUID) {
    Team team = teamRepository.findById(teamUUID).orElseThrow(IllegalArgumentException::new);
    return team.toEntity();
  }
}
