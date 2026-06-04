package com.mooglebook.domain.usecases.game;

import com.mooglebook.domain.entities.Game;
import com.mooglebook.domain.gateways.game.GameGateway;

public class FindByIdUseCaseImpl implements FindByIdUseCase {

    private final GameGateway gateway;

    public FindByIdUseCaseImpl(GameGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public Game execute(Long id){
        return gateway.findById(id);
    }
}
