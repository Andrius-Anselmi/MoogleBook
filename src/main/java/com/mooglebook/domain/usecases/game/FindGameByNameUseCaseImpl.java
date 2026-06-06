package com.mooglebook.domain.usecases.game;

import com.mooglebook.domain.entities.Game;
import com.mooglebook.domain.exception.NotFoundGameException;
import com.mooglebook.domain.gateways.game.GameGateway;

public class FindGameByNameUseCaseImpl implements FindGameByNameUseCase {

    private final GameGateway gateway;

    public FindGameByNameUseCaseImpl(GameGateway gateway){
        this.gateway = gateway;
    }
    @Override
    public Game execute(String name) {
        return gateway.findGameByName(name)
                .orElseThrow(() -> new NotFoundGameException("Game not found with name:  "+ name));
    }
}
