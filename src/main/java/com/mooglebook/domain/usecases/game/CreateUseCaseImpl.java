package com.mooglebook.domain.usecases.game;

import com.mooglebook.domain.entities.Game;
import com.mooglebook.domain.gateways.game.GameGateway;

public class CreateUseCaseImpl implements CreateUseCase {

    private final GameGateway gateway;

    public CreateUseCaseImpl(GameGateway gateway){
        this.gateway =gateway;
    }

    @Override
    public Game execute(Game game){
        return gateway.create(game);
    }
}
