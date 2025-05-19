package com.estudos.dlist_games.services;

import com.estudos.dlist_games.dto.GameMinDTO;
import com.estudos.dlist_games.entities.Game;
import com.estudos.dlist_games.repositories.GameRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    private final GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }

}
