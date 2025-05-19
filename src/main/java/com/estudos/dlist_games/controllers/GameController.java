package com.estudos.dlist_games.controllers;

import com.estudos.dlist_games.dto.GameMinDTO;
import com.estudos.dlist_games.entities.Game;
import com.estudos.dlist_games.services.GameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping
    public List<GameMinDTO> findAll() {
        return gameService.findAll();
    }



}
