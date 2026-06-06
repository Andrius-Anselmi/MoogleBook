package com.mooglebook.domain.usecases.game;

import com.mooglebook.domain.entities.Game;

public interface FindGameByNameUseCase {

    Game execute(String name);
}
