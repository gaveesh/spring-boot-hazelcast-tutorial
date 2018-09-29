package com.gaveesh.gupta;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gaveesh.gupta.model.Player;
import com.gaveesh.gupta.service.SoccerService;

@Controller
public class PlayerController {
	@Autowired
	SoccerService soccerService;
	
	@RequestMapping(value="/addPlayer", method = RequestMethod.POST)
    public void addPlayer(@RequestBody Player player){
        soccerService.addBarcelonaPlayer(player.getName(), player.getPosition(), player.getNum());
    }

	@ResponseBody
    @RequestMapping(value="/getAllTeamPlayer", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
    public List<String> getAllTeamPlayer(){

    	List<String> players = soccerService.getAllTeamPlayers(1);
    	return players; 
}
}
