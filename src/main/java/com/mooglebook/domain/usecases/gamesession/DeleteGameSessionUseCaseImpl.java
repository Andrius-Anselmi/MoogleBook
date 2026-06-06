package com.mooglebook.domain.usecases.gamesession;

import com.mooglebook.domain.exception.NotFoundGameSessionException;
import com.mooglebook.domain.gateways.game.GameSessionGateway;

public class DeleteGameSessionUseCaseImpl implements DeleteGameSessionUseCase {

    private final GameSessionGateway gateway;

    public DeleteGameSessionUseCaseImpl(GameSessionGateway gateway){
        this.gateway = gateway;
    }

    @Override
    public void execute(Long id) {
        gateway.findById(id).orElseThrow(() -> new NotFoundGameSessionException("Game session not found with id: " + id));
        gateway.delete(id);
    }
}
