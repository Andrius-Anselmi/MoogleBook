package com.mooglebook.domain.usecases.gamesession;

import com.mooglebook.domain.entities.GameSession;
import com.mooglebook.domain.gateways.game.GameSessionGateway;

import java.time.LocalDateTime;
import java.util.List;

public class FilterGameSessionsByDateUseCaseImpl implements FilterGameSessionsByDateUseCase {

    private final GameSessionGateway gateway;

    public FilterGameSessionsByDateUseCaseImpl(GameSessionGateway gateway){
        this.gateway = gateway;
    }
    @Override
    public List<GameSession> execute(LocalDateTime sessionDate) {
        return gateway.findGamesBySessionDate(sessionDate);
    }
}
