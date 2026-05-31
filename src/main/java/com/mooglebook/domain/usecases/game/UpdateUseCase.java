package com.mooglebook.domain.usecases.game;

import com.mooglebook.domain.entities.Game;

public interface UpdateUseCase {

    Game execute(Long id, Game game);
}
