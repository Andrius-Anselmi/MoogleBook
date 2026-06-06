package com.mooglebook.domain.usecases.gamesession;

import com.mooglebook.domain.entities.GameSession;

import java.time.LocalDateTime;
import java.util.List;

public interface FilterGameSessionsByDateUseCase {

    List<GameSession> execute(LocalDateTime sessionDate);
}
