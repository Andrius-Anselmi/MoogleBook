package com.mooglebook.domain.usecases.gamesession;

import com.mooglebook.domain.entities.GameSession;
import com.mooglebook.domain.gateways.game.GameSessionGateway;

import java.util.Optional;

public class FindGameSessionByIdUseCaseImpl implements FindGameSessionByIdUseCase {

    private final GameSessionGateway gateway;

    public FindGameSessionByIdUseCaseImpl(GameSessionGateway gateway){
        this.gateway = gateway;
    }
    @Override
    public GameSession execute(Long id) {
        Optional<GameSession> gameSessionId = gateway.findById(id);
        if(gameSessionId.isPresent()){
            return gameSessionId.get();
        }

        return null;
    }
}
