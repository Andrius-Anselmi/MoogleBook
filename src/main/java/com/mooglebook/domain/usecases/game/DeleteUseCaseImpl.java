package com.mooglebook.domain.usecases.game;

import com.mooglebook.domain.exception.NotFoundGameException;
import com.mooglebook.domain.gateways.game.GameGateway;

public class DeleteUseCaseImpl implements DeleteUseCase {

    private final GameGateway gateway;

    public DeleteUseCaseImpl(GameGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public void execute(Long id){
        gateway.findById(id).orElseThrow(() -> new NotFoundGameException("Game not found with id: " + id));
        gateway.delete(id);
    }

}
