package com.rps.model;

public class Game {
	public static Player play(Player player1, Player player2) {
		if(player1.defeats(player2)) return player1;
		else if(player2.defeats(player1)) return player2;
		else return Judge.getJudge();
	}
}
