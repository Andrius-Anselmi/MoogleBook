package com.mooglebook.domain.usecases.game;

import com.mooglebook.domain.entities.Game;
import com.mooglebook.domain.gateways.game.GameGateway;

public class UpdateUseCaseImpl implements UpdateUseCase {

    private final GameGateway gateway;

    public UpdateUseCaseImpl(GameGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public Game execute(Long id, Game game){
        return gateway.update(id, game);
    }
}
