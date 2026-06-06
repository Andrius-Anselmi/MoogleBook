package com.mooglebook.domain.usecases.gamesession;

import com.mooglebook.domain.dtos.CreateGameSessionInput;
import com.mooglebook.domain.entities.GameSession;

public interface CreateGameSessionUseCase {

    GameSession execute(CreateGameSessionInput gameSession);
}
