package com.mooglebook.domain.usecases.gamesession;

import com.mooglebook.domain.entities.GameSession;
import com.mooglebook.domain.gateways.game.GameSessionGateway;

import java.util.List;

public class FindAllGameSessionsUseCaseImpl implements FindAllGameSessionsUseCase {

    private final GameSessionGateway gateway;

    public FindAllGameSessionsUseCaseImpl(GameSessionGateway gateway){
        this.gateway = gateway;
    }
    @Override
    public List<GameSession> execute() {
        return gateway.findAll();
    }
}
