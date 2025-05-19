package com.estudos.dlist_games.repositories;

import com.estudos.dlist_games.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
