package com.mooglebook.domain.usecases.game;

import com.mooglebook.domain.entities.Game;
import com.mooglebook.domain.enums.Genre;

import java.util.List;

public interface FilterByGenreUseCase {

    List<Game> execute(Genre genre);
}
