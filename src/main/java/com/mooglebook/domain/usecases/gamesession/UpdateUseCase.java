package com.mooglebook.domain.usecases.gamesession;

import com.mooglebook.domain.entities.GameSession;

public interface UpdateUseCase {

    GameSession execute(Long id, GameSession gameSession);
}
