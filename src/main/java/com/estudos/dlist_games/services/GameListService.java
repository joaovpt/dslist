package com.estudos.dlist_games.services;

import com.estudos.dlist_games.dto.GameDTO;
import com.estudos.dlist_games.dto.GameListDTO;
import com.estudos.dlist_games.dto.GameMinDTO;
import com.estudos.dlist_games.entities.Game;
import com.estudos.dlist_games.entities.GameList;
import com.estudos.dlist_games.repositories.GameListRepository;
import com.estudos.dlist_games.repositories.GameRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    private final GameListRepository gameListRepository;

    public GameListService(GameListRepository gameListRepository) {
        this.gameListRepository = gameListRepository;
    }

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }

}
