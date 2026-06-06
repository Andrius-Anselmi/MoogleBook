package com.mooglebook.domain.usecases.game;

import com.mooglebook.domain.entities.Game;
import com.mooglebook.domain.enums.Genre;
import com.mooglebook.domain.gateways.game.GameGateway;

import java.util.List;

public class FilterGameByGenreUseCaseImpl implements FilterGameByGenreUseCase {

    private final GameGateway gateway;

    public FilterGameByGenreUseCaseImpl(GameGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public List<Game> execute(Genre genre){
        return gateway.filterByGenre(genre);
    }
}
