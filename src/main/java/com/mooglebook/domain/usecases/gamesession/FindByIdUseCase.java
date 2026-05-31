package com.mooglebook.domain.usecases.gamesession;

import com.mooglebook.domain.entities.GameSession;

public interface FindByIdUseCase {

    GameSession execute(Long id);
}
