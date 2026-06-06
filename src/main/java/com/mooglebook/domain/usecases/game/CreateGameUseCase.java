package com.mooglebook.domain.usecases.game;

import com.mooglebook.domain.entities.Game;

public interface CreateGameUseCase {

    Game execute(Game game);
}
