package com.mooglebook.domain.usecases.game;

import com.mooglebook.domain.entities.Game;
import com.mooglebook.domain.gateways.game.GameGateway;

public class UpdateGameUseCaseImpl implements UpdateGameUseCase {

    private final GameGateway gateway;

    public UpdateGameUseCaseImpl(GameGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public Game execute(Long id, Game game){
        return gateway.update(id, game);
    }
}
