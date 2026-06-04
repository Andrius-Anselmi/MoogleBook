package com.mooglebook.domain.usecases.game;

import com.mooglebook.domain.entities.Game;
import com.mooglebook.domain.gateways.game.GameGateway;

import java.util.List;

public class FindAllUseCaseImpl implements FindAllUseCase {

    private final GameGateway gateway;

    public FindAllUseCaseImpl(GameGateway gateway){
        this.gateway = gateway;
    }

    @Override
    public List<Game> execute(){
        return gateway.findAll();
    }
}
