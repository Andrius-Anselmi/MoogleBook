package com.mooglebook.domain.usecases.game;

import com.mooglebook.domain.entities.Game;
import com.mooglebook.domain.exception.NotFoundGameException;
import com.mooglebook.domain.gateways.game.GameGateway;

public class FindGameByIdUseCaseImpl implements FindGameByIdUseCase {

    private final GameGateway gateway;

    public FindGameByIdUseCaseImpl(GameGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public Game execute(Long id){
        return gateway.findById(id).orElseThrow(() -> new NotFoundGameException(
                "Game not found with id: " + id));
    }
}
