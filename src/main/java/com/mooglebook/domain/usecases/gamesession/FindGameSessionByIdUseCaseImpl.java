package com.mooglebook.domain.usecases.gamesession;

import com.mooglebook.domain.entities.GameSession;
import com.mooglebook.domain.exception.NotFoundGameSessionException;
import com.mooglebook.domain.gateways.game.GameSessionGateway;

public class FindGameSessionByIdUseCaseImpl implements FindGameSessionByIdUseCase {

    private final GameSessionGateway gateway;

    public FindGameSessionByIdUseCaseImpl(GameSessionGateway gateway){
        this.gateway = gateway;
    }
    @Override
    public GameSession execute(Long id) {
        return gateway.findById(id).orElseThrow(() -> new NotFoundGameSessionException("Game session not found with id: " + id));
    }
}
