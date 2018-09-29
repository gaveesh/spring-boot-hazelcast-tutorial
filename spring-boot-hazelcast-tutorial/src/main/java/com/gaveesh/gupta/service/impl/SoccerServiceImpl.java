package com.gaveesh.gupta.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.gaveesh.gupta.model.Player;
import com.gaveesh.gupta.model.Team;
import com.gaveesh.gupta.repository.PlayerRepository;
import com.gaveesh.gupta.repository.TeamRepository;
import com.gaveesh.gupta.service.SoccerService;
@Service
@CacheConfig(cacheNames = "players")
public class SoccerServiceImpl implements SoccerService {
    @Autowired
    private PlayerRepository playerRepository;
    @Autowired
    private TeamRepository teamRepository;
    
    @Cacheable()
    public List<String> getAllTeamPlayers(long teamId) {
        List<String> result = new ArrayList<String>();
        List<Player> players = playerRepository.findByTeamId(teamId);
        for (Player player : players) {
            result.add(player.getName());
        }
        return result;
    }
    public void addBarcelonaPlayer(String name, String position, int number) {
        Team barcelona = teamRepository.findOne(1l);
        Player newPlayer = new Player();
        newPlayer.setName(name);
        newPlayer.setPosition(position);
        newPlayer.setNum(number);
        newPlayer.setTeam(barcelona);
        playerRepository.save(newPlayer);
    }
}
