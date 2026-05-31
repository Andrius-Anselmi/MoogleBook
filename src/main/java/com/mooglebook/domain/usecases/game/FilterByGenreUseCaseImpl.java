package com.mooglebook.domain.usecases.game;

import com.mooglebook.domain.entities.Game;
import com.mooglebook.domain.enums.Genre;

import java.util.List;

public class FilterByGenreUseCaseImpl implements FilterByGenreUseCase {

    @Override
    public List<Game> execute(Genre genre){
        return null;
    }
}
