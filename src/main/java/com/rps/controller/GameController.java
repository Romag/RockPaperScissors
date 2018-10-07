package com.rps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rps.service.GameService;

@RestController
public class GameController {
	@Autowired
	private GameService gameService;

	
	
	
}
