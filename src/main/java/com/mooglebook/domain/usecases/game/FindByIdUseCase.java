package com.mooglebook.domain.usecases.game;

import com.mooglebook.domain.entities.Game;

public interface FindByIdUseCase {

    Game execute(Long id);
}
