package com.mooglebook.domain.usecases.game;

import com.mooglebook.domain.entities.Game;
import com.mooglebook.domain.enums.Status;
import com.mooglebook.domain.gateways.game.GameGateway;

import java.util.List;

public class FilterByStatusUseCaseImpl implements FilterByStatusUseCase {

    private final GameGateway gateway;

    public FilterByStatusUseCaseImpl(GameGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public List<Game> execute(Status status){
        return gateway.filterByStatus(status);
    }
}
