package com.mooglebook.domain.usecases.game;

import com.mooglebook.domain.entities.Game;

import java.util.List;

public interface FindAllGamesUseCase {

    List<Game> execute();
}
