package com.mooglebook.domain.usecases.game;

import com.mooglebook.domain.entities.Game;
import com.mooglebook.domain.enums.Status;
import com.mooglebook.domain.gateways.game.GameGateway;

import java.util.List;

public class FilterGameByStatusUseCaseImpl implements FilterGameByStatusUseCase {

    private final GameGateway gateway;

    public FilterGameByStatusUseCaseImpl(GameGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public List<Game> execute(Status status){
        return gateway.filterByStatus(status);
    }
}
