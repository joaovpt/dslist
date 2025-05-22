package com.estudos.dlist_games.controllers;

import com.estudos.dlist_games.dto.GameDTO;
import com.estudos.dlist_games.dto.GameListDTO;
import com.estudos.dlist_games.dto.GameMinDTO;
import com.estudos.dlist_games.dto.ReplacementDTO;
import com.estudos.dlist_games.services.GameListService;
import com.estudos.dlist_games.services.GameService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    private final GameListService gameListService;
    private final GameService gameService;

    public GameListController(GameListService gameListService, GameService gameService) {
        this.gameListService = gameListService;
        this.gameService = gameService;
    }

    @GetMapping
    public List<GameListDTO> findAll() {
        return gameListService.findAll();
    }

    @GetMapping("/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId) {
        return gameService.findByList(listId);
    }

    @PostMapping("/{listId}/replacement")
    public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body) {
        gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
    }

}
