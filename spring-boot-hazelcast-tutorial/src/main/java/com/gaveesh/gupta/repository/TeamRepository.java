package com.gaveesh.gupta.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gaveesh.gupta.model.Team;

@Repository
public interface TeamRepository extends CrudRepository<Team, Long> {
	Team findByPlayers(long playerId);
}
