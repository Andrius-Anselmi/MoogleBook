package com.mooglebook.domain.gateways.game;

import com.mooglebook.domain.entities.Game;
import com.mooglebook.domain.enums.Genre;
import com.mooglebook.domain.enums.Status;

import java.util.List;
import java.util.Optional;

public interface GameGateway {

    Game create(Game game);
    List<Game> findAll();
    void delete(Long id);
    List<Game> filterByGenre(Genre genre);
    List<Game> filterByStatus(Status status);
    Optional<Game> findById(Long id);
    Game update(Long id, Game game);
    Optional<Game> findGameByName(String name);

}
