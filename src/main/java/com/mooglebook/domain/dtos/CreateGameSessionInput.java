package com.mooglebook.domain.dtos;

import java.time.LocalDateTime;

public record CreateGameSessionInput(
        LocalDateTime sessionDate,
        Double duration,
        String annotation,
        Long game
) {}

