package com.skku.bloodline.controller;

import com.skku.bloodline.dto.base.BaseResponse;
import com.skku.bloodline.dto.base.ResponseMessage;
import com.skku.bloodline.dto.request.CreateTeamDTO;
import com.skku.bloodline.service.TeamService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {
  private final TeamService teamService;

  public TeamController(TeamService teamService) {
    this.teamService = teamService;
  }

  @PostMapping("/api/teams")
  public ResponseEntity<?> saveTeams(@RequestBody CreateTeamDTO createTeamDTO) {
    return new ResponseEntity<>(
        BaseResponse.response(
            HttpStatus.OK, ResponseMessage.POST_TEAM, teamService.saveTeam(createTeamDTO)),
        HttpStatus.OK);
  }
}
