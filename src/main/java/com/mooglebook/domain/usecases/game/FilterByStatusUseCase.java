package com.mooglebook.domain.usecases.game;

import com.mooglebook.domain.entities.Game;
import com.mooglebook.domain.enums.Status;

import java.util.List;

public interface FilterByStatusUseCase {

    List<Game> execute(Status status);
}
