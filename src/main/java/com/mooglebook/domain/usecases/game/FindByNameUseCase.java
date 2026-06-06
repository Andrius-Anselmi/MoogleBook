package com.mooglebook.domain.usecases.game;

import com.mooglebook.domain.entities.Game;

public interface FindByNameUseCase {

    Game execute(String name);
}
