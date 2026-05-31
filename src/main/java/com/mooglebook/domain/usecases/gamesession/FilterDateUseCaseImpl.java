package com.mooglebook.domain.usecases.gamesession;

import com.mooglebook.domain.entities.GameSession;

import java.time.LocalDateTime;
import java.util.List;

public class FilterDateUseCaseImpl implements FilterByDateUseCase {
    @Override
    public List<GameSession> execute(LocalDateTime sessionDate) {
        return null;
    }
}
