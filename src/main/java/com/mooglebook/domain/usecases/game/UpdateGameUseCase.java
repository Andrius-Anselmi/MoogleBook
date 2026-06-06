package com.mooglebook.domain.usecases.game;

import com.mooglebook.domain.entities.Game;

public interface UpdateGameUseCase {

    Game execute(Long id, Game game);
}
