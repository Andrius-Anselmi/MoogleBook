package com.mooglebook.domain.usecases.game;

import com.mooglebook.domain.entities.Game;
import com.mooglebook.domain.gateways.game.GameGateway;

import java.util.List;

public class FindAllGamesUseCaseImpl implements FindAllGamesUseCase {

    private final GameGateway gateway;

    public FindAllGamesUseCaseImpl(GameGateway gateway){
        this.gateway = gateway;
    }

    @Override
    public List<Game> execute(){
        return gateway.findAll();
    }
}
