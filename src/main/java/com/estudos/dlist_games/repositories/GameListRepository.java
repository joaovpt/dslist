package com.estudos.dlist_games.repositories;

import com.estudos.dlist_games.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
