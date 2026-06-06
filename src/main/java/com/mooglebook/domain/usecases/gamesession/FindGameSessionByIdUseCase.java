package com.mooglebook.domain.usecases.gamesession;

import com.mooglebook.domain.entities.GameSession;

public interface FindGameSessionByIdUseCase {

    GameSession execute(Long id);
}
