package com.mooglebook.domain.usecases.game;

import com.mooglebook.domain.entities.Game;

public interface FindGameByIdUseCase {

    Game execute(Long id);
}
