package com.mooglebook.domain.usecases.game;

import com.mooglebook.domain.entities.Game;
import com.mooglebook.domain.exception.NotFoundGameException;
import com.mooglebook.domain.gateways.game.GameGateway;

public class FindByNameUseCaseImpl implements FindByNameUseCase {

    private final GameGateway gateway;

    public FindByNameUseCaseImpl(GameGateway gateway){
        this.gateway = gateway;
    }
    @Override
    public Game findByName(String name) {
        return gateway.findGameByName(name)
                .orElseThrow(() -> new NotFoundGameException("Game not found with name:  "+ name));
    }
}
