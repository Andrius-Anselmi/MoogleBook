package com.mooglebook.domain.usecases.gamesession;

import com.mooglebook.domain.entities.GameSession;

public interface UpdateGameSessionUseCase {

    GameSession execute(Long id, GameSession gameSession);
}
