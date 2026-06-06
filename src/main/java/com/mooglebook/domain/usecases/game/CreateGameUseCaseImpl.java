package com.mooglebook.domain.usecases.game;

import com.mooglebook.domain.entities.Game;
import com.mooglebook.domain.exception.DuplicateGameException;
import com.mooglebook.domain.gateways.game.GameGateway;

public class CreateGameUseCaseImpl implements CreateGameUseCase {

    private final GameGateway gateway;

    public CreateGameUseCaseImpl(GameGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public Game execute(Game game) {
        gateway.findGameByName(game.name()).ifPresent( e-> {
            throw new DuplicateGameException("Game " + game.name() + "already exists");
        });

        return gateway.create(game);
    }
}
