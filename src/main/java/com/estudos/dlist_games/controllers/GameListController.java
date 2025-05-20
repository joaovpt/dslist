package com.estudos.dlist_games.controllers;

import com.estudos.dlist_games.dto.GameDTO;
import com.estudos.dlist_games.dto.GameListDTO;
import com.estudos.dlist_games.dto.GameMinDTO;
import com.estudos.dlist_games.services.GameListService;
import com.estudos.dlist_games.services.GameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    private final GameListService gameListService;

    public GameListController(GameListService gameListService) {
        this.gameListService = gameListService;
    }

    @GetMapping
    public List<GameListDTO> findAll() {
        return gameListService.findAll();
    }
    
}
