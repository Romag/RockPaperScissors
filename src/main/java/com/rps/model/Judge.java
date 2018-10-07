package com.rps.model;

public class Judge extends Player {
	private static Judge judge;
	
	private Judge() {
	}
	
	public static Judge getJudge() {
		if(judge == null) judge = new Judge();
		
		return judge;
	}
}
