package com.estudos.dlist_games.controllers;

import com.estudos.dlist_games.dto.GameDTO;
import com.estudos.dlist_games.dto.GameMinDTO;
import com.estudos.dlist_games.entities.Game;
import com.estudos.dlist_games.services.GameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/{id}")
    public GameDTO findById(@PathVariable("id") Long id) {
        return gameService.findById(id);
    }



}
