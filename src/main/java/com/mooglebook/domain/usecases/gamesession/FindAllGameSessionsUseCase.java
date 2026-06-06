package com.mooglebook.domain.usecases.gamesession;

import com.mooglebook.domain.entities.GameSession;

import java.util.List;

public interface FindAllGameSessionsUseCase {

    List<GameSession> execute();
}
