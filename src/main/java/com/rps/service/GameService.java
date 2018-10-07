package com.rps.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.rps.model.Game;
import com.rps.model.Player;

public class GameService {
	
	@Autowired
	private Game game;
	
	private Player humanPlayer;
	private Player computer;

	public String clashPlayers(Player player1, Player player2) {
		if(player1.defeats(player2)) return "player1";
		else return "player2";
	}
	
}
